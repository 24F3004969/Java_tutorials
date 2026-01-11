package org.java_tutorials.tuition.shahir.part_1.tutorials_12;

public class Text {
    public enum Spacing {
        UNIFORM(-1);
         private final int a;
        Spacing(int a) {
            this.a=a;
        }
        int getSpacing(){
            return a;
        }
    }

    Spacing spacing;
    private int width;
    private String[] list_text;

    public Text(int width, Spacing spacing, String... list_text) {
        this.width = width;
        this.list_text = list_text;
        this.spacing = spacing;
    }
    public String getText(){
        StringBuilder text=new StringBuilder();
        int spacing=getValue();
        for (int i = 0; i < list_text.length; i++) {
            String list = list_text[i];
            if (i<list_text.length-1)
             text.append(list).append(getSpace(list.length()/2+spacing-list_text[i+1].length()/2));
            else  text.append(list);
        }
        return text.toString();
    }
    String getSpace(int n){
        return " ".repeat(n);
    }

    private int getValue() {
        if (spacing.equals(Spacing.UNIFORM)){
            return width/list_text.length;
        }
        return spacing.getSpacing();
    }

    public static void main(String[] args) {
        System.out.println(new Text(50,Spacing.UNIFORM,"kjfdhgfjkghfldjkghfjdk;ghfdkljh","Hatif Imam","Anas Imam").getText());
    }
}
