package org.java_tutorials.dsa.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReaderExample {

    public static void main(String[] args) {
        try{
            BufferedImage image = ImageIO.read(new File("/tmp/input.jpg"));

            image.getGraphics().drawLine(1, 1, image.getWidth()-1, image.getHeight()-1);
            image.getGraphics().drawLine(1, image.getHeight()-1, image.getWidth()-1, 1);

            ImageIO.write(image, "png", new File("/tmp/output.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}