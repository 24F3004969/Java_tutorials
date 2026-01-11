package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.*;


public class CurrencyNotes {
    private String symbol;
    private final Currency[] list;


    public CurrencyNotes(Currency... list) {
        this.list = list;
        Arrays.sort(list, Comparator.comparing(Currency::notesName, Comparator.reverseOrder()));
    }

    public CurrencyNotes(String symbol, Currency... list) {
        this.symbol = symbol;
        this.list = list;
        Arrays.sort(list, Comparator.comparing(Currency::notesName, Comparator.reverseOrder()));
    }

    public String getSymbol() {
        return symbol;
    }

    public LinkedHashSet<Notes> getMaxPossibleNoteNumbers(double amount) {
        var notes_list = new LinkedHashSet<Notes>();
        for (var i : list) {
            var z = (long) amount / i.value();
            notes_list.add(new Notes(getSymbol() + " "
                    + i.notesName() + " notes ", z, i.value()));
            amount %= i.value();

        }
        return notes_list;
    }

    public List<Notes> getMaxPossibleNoteNumbers(double amount, CurrencyLimit... currencyLimitValues) {
        var d_list = new LinkedHashSet<>(List.of(list));
        Arrays.stream(currencyLimitValues).map(CurrencyLimit::currencyType).forEach(d_list::remove);
        var notes_list = new LinkedHashSet<Notes>();
        for (var i : currencyLimitValues) {
            var c = i.currencyType();
            var z = (long) amount / c.value();
            if (z < i.limit()) {
                notes_list.add(new Notes(getSymbol() + " "
                        + c.notesName() + " notes ", z, c.value()));
                amount %= c.value();
            } else {
                notes_list.add(new Notes(getSymbol() + " " +
                        c.notesName() + " notes ", i.limit(), c.value()));
                amount -= i.limit() * c.value();
            }

        }
        if (d_list.isEmpty()) {
            System.err.println("Warning: Limit overflowed:Adding to " +
                    "smallest possible value of currency");
            notes_list.add(new Notes(getSymbol() + " " +
                    list[list.length - 1].notesName() + " notes ",
                    (long) amount, list[list.length - 1].value()));
        } else {
            for (var i : d_list) {
                var z = (long) amount / i.value();
                notes_list.add(new Notes(getSymbol() + " " +
                        i.notesName() + " notes ", z, i.value()));
                amount %= i.value();
            }
        }
        return notes_list.stream().sorted(Comparator.
                comparing(Notes::value, Comparator.reverseOrder())).toList();
    }

    public static void main(String[] args) {
        var ty = new Currency[]{new Currency("500", 500),
                new Currency("200", 200),
                new Currency("100", 100),
                new Currency("50", 50),
                new Currency("20", 20),
                new Currency("10", 10)};
        var f = new CurrencyNotes("₹", ty);
        System.out.println(f.getMaxPossibleNoteNumbers(896786567,
                new CurrencyLimit(ty[0], 80),
                new CurrencyLimit(ty[1], 30),
                new CurrencyLimit(ty[2], 30)));
    }

}
