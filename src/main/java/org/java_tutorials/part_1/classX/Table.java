package org.java_tutorials.part_1.classX;

public class Table {
    String[] a = {"╤", "═══", "╔", "╗"};
    String[] b = {"│", "   ", "║",};
    String[] c = {"┼", "───", "╟", "╢"};
    String[] d = {"╧", "═══", "╚", "╝"};

    public static void main(String[] args) {
        String[][] table = new String[6][5];
        table[0]=new String[]{"Name","Age","Gender","Phone no","Email"};

        for (int i = 1; i < 6; i++) {
            table[i] = new String[]{"helal anwar",
                    "24",
                    "male",
                    "7895432156786245646787844561231231846512349456184998465898",
                    "ljhjk@gmail.com"};
        }
        printTable(table);
    }

    public static void printTable(String[][] table) {
        int max_size = findMaxElementSize(table);
        StringBuilder st = new StringBuilder();
        for (int j = 0; j < table.length; j++) {
            var strings = table[j];
            for (String str : strings) {
                st.append(adjustSpace(str, max_size + 1));
            }
            st.append('\n');
            if (j==0){
                for (int i = 0; i < table[0].length; i++) {
                    String se="-".repeat(table[0][i].length());
                    st.append("\033[0;32m").
                            append(adjustSpace(se,max_size+1)).
                            append("\33[0m");
                }
                st.append('\n');
            }

        }
        System.out.println(st);
    }

    public static String adjustSpace(String s, int size) {
        return (s + " ".repeat(size - s.length()));
    }

    public static int findMaxElementSize(String[][] table) {
        int max = 0;
        for (var strings : table) {
            for (var str : strings) {
                if (str.length() > max)
                    max = str.length();
            }
        }
        return max;
    }
}
