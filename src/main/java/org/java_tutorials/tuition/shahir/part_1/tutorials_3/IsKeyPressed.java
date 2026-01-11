package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

import java.awt.*;
import java.awt.event.KeyEvent;

public class IsKeyPressed {
    private static volatile boolean wPressed = false;
    public static boolean isWPressed() {
        synchronized (IsKeyPressed.class) {
            return wPressed;
        }
    }

    public static void main(String[] args) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(ke -> {
            synchronized (IsKeyPressed.class) {
                System.out.println("hhh");
                switch (ke.getID()) {
                    case KeyEvent.KEY_PRESSED -> {
                        if (ke.getKeyCode() == KeyEvent.VK_W) {
                            wPressed = true;
                        }
                    }
                    case KeyEvent.KEY_RELEASED -> {
                        if (ke.getKeyCode() == KeyEvent.VK_W) {
                            wPressed = false;
                        }
                    }
                }
                return false;
            }
        });
    }
}