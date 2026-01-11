package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class RamazanFoodList {
    private final String[] IftarDishes = {"Aloo Dum", "Keema Samosa", "Aloo samosa", "Fried Chuda",
            "Fruit Salads", "Meetha Tukda", "Dahi Vada", "Mal Pua", "Egg Chop", "Bread Chop", "Aloo Chop", "Jalebi"};
    private final String[] Dinner = {"Biryani", "Pulaw", "Fish & rice", "Rice and veg", "Egg and rice", "Meat and rice"};
    private final String[] ShariDishes = {"Faluda", "Puding", "Pudding", "Sevai", "Mangoes","Milk & bread"};
    TreeMap<LocalDate, String[]> foodChart = new TreeMap<>();
    private LocalDate localDate;

    public RamazanFoodList(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void generateChart() {
        for (int i = 0; i < 30; i++) {
            String[] foods = {generateIftarFood(), generateDinner(), generateShariFood()};
            foodChart.put(localDate, foods);
            localDate = localDate.plusDays(1);
        }
        printChart();
    }

    private String generateShariFood() {
        String mandatoryDishesForShari = "Left over food of dinner,";
        StringBuilder x = new StringBuilder(mandatoryDishesForShari);
        x.append(ShariDishes[(int) (Math.random() * ShariDishes.length)]).append(",");
        return x.substring(0, x.length() - 1);
    }

    private String generateDinner() {
        return Dinner[(int) (Math.random() * Dinner.length)];
    }

    private String generateIftarFood() {
        int numberOfItems = 1 + ((int) (Math.random() * 2 + 1));
        String mandatoryDishesForIftar = "Dates,Sharbat,Water,Chana Ghugni & Pakora,";
        StringBuilder x = new StringBuilder(mandatoryDishesForIftar);
        ArrayList<String> list= new ArrayList<>(List.of(IftarDishes));
        for (int i = 1; i <= numberOfItems; i++) {
            int po=(int) (Math.random() * list.size());
            String k = list.get(po);
            x.append(k).append(",");
            list.remove(po);
        }
        return x.substring(0, x.length() - 1);
    }

    private void printChart() {
         LocalDate date =localDate.minusDays(30);
         int x1=foodChart.get(date)[0].length();
         int x2=foodChart.get(date)[1].length();
         int size = 30;
         System.out.println("Date"+space(date.toString().length()-"Date".length(), size)+
                 "Iftar"+space(x1-"Iftar".length(), size)+
                 "Dinner"+space(x2-"Dinner".length(), size)+"Shari");
         for (int i = 0; i < 200; i++) {
              System.out.print("=");
         }
         System.out.println();
        for (LocalDate l : foodChart.keySet()) {
            System.out.println(l+space(0, size)+ foodChart.get(l)[0]+
                    space(x1-foodChart.get(l)[0].length(), size) +foodChart.get(l)[1]+
                    space(x2-foodChart.get(l)[1].length(), size) + foodChart.get(l)[2]);
        }
    }

     private String space(int i, int size) {
         size=size+i;
          return " ".repeat(Math.max(0, size));
     }

     public static void main(String[] args) {
        RamazanFoodList ramazanFoodList = new RamazanFoodList(LocalDate.parse("2025-02-28"));
        ramazanFoodList.generateChart();
    }
}
