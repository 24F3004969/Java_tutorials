package org.java_tutorials.part_1.algorithem;

import org.java_tutorials.function.App;

public class a {
    public static final String STRING = "21312963";

    public static void main(String[] args) {
        String x= """
                  String[][][] DefenderString = {{{"#b2", "#b3"}, {"#b7", "#b4"}, {"#b5", "#b9"}},
                            {{"#b3", "#b1"}, {"#b5", "#b8"}},
                            {{"#b2", "#b1"}, {"#b6", "#b9"}, {"#b5", "#b7"}},
                            {{"#b1", "#b7"}, {"#b5", "#b6"}},
                            {{"#b1", "#b9"}, {"#b3", "#b7"}, {"#b2", "#b8"}, {"#b4", "#b6"}},
                            {{"#b5", "#b4"}, {"#b3", "#b9"}},
                            {{"#b1", "#b4"}, {"#b9", "#b8"}, {"#b5", "#b3"}},
                            {{"#b9", "#b7"}, {"#b2", "#b5"}},
                            {{"#b6", "#b3"}, {"#b7", "#b8"}, {"#b1", "#b5"}}};
                    String[][] WinString = {{"#b1", "#b2", "#b3"}, {"#b1", "#b4", "#b7"}, {"#b1", "#b5", "#b9"},
                            {"#b2", "#b1", "#b3"}, {"#b2", "#b3", "#b1"}, {"#b3", "#b2", "#b1"},
                            {"#b3", "#b6", "#b9"}, {"#b3", "#b9", "#b6"}, {"#b4", "#b1", "#b7"}, {"#b4", "#b5", "#b6"},
                            {"#b5", "#b1", "#b9"}, {"#b5", "#b3", "#b7"}, {"#b5", "#b2", "#b8"}, {"#b5", "#b4", "#b6"},
                            {"#b6", "#b3", "#b9"}, {"#b6", "#b5", "#b4"}, {"#b7", "#b4", "#b1"}, {"#b7", "#b5", "#b3"},
                            {"#b7", "#b8", "#b9"}, {"#b8", "#b5", "#b2"}, {"#b8", "#b7", "#b9"}, {"#b9", "#b5", "#b1"},
                            {"#b9", "#b8", "#b7"}, {"#b9", "#b6", "#b3"}};
                """;
        x=x.replace("#b1", STRING + "25");
        x=x.replace("#b2", STRING + "26");
        x=x.replace("#b3", STRING + "27");
        x=x.replace("#b4", STRING + "29");
        x=x.replace("#b5", STRING + "28");
        x=x.replace("#b6", STRING + "30");
        x=x.replace("#b7", STRING + "31");
        x=x.replace("#b8", STRING + "32");
        x=x.replace("#b9", STRING + "33");
        System.out.println(x);
    }
}
