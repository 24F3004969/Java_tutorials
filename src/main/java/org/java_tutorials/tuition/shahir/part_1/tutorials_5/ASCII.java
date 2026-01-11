package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public final class ASCII {
    boolean negative;


    public ASCII() {
        this(false);
    }

    public ASCII(final boolean negative) {
        this.negative = negative;
    }

    public String convert(final BufferedImage image, ArrayList<Character> c) {
        StringBuilder sb = new StringBuilder((image.getWidth() + 1)
                * image.getHeight());
        int k = 0;
        for (int y = 0; y < image.getHeight(); y=y+2) {
            if (!sb.isEmpty()) sb.append("\n");
            for (int x = 0; x < image.getWidth(); x=x+1) {
                Color pixelColor = new Color(image.getRGB(x, y));
                double gValue = (double) pixelColor.getRed() * 0.2989 +
                        (double) pixelColor.getBlue() * 0.5870 +
                        (double) pixelColor.getGreen() * 0.1140;
                /*final char s = negative ? returnStrNeg(gValue) :
                        returnStrPos(gValue);*/

                //if (gValue >= 0 && gValue <= 256) {
                    var cr = getColoredText((int)gValue, "" + c.get(k));
                    sb.append(cr);
                    k = (k < c.size() - 1) ? k + 1 : 0;

                //} else sb.append(" ");

            }

        }

        return sb.toString();
    }
    String getColoredText(int code, String s) {
        String st = "", value;
        int i = code / 16;
        int j = code % 16;
        value = String.valueOf(i * 16 + j);
        st = "\u001b[38;5;" + value + "m";
        st = st + s + "\u001b[0m";
        return st;
    }

    public static void main(String[] args) throws IOException {
        File f = new File(args[0]);
        final BufferedImage image = ImageIO.read(f);
        ArrayList<Character> c = new ArrayList<>();

        try (Scanner reader = new Scanner(new FileReader(args[1]))) {
            while (reader.hasNext()) {
                var d=reader.next();
                var t = (d+" ").toCharArray();
                for (var y : t)
                    c.add(y);
            }


        }
        //System.out.println(c);
        final String ascii = new ASCII().convert(image, c);
        System.out.println(ascii);
    }

}
