package org.java_tutorials.dsa.algorithem;

import java.awt.*;
import javax.swing.*;

public class Grid {

    public static void main(String[] args) {
        new Grid();
    }

    public Grid() {
        EventQueue.invokeLater(() -> {
           /* try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }*/

            JFrame frame = new JFrame("My App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new TestPane());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    public class TestPane extends JPanel {

        public TestPane() {
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            int size = Math.min(getWidth() - 4, getHeight() - 4) / 10;
            int width = getWidth() - (size * 2);
            int height = getHeight() - (size * 2);

            int y = (getHeight() - (size * 10)) / 2;
            for (int horz = 0; horz < 10; horz++) {
                int x = (getWidth() - (size * 10)) / 2;
                for (int vert = 0; vert < 10; vert++) {
                    g.drawRect(x, y, size, size);

                    x += size;
                }
                y += size;
            }
            g2d.dispose();
        }

    }
}