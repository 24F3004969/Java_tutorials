package org.java_tutorials.tuition.shahir.function;

import java.util.logging.*;

class SomeClass {
    public void logIt() {
        Logger.getGlobal().info("First message");
    }
}

class FClass {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        obj.logIt();
        Logger.getGlobal().log(Level.FINE, "second message");
        Logger.getGlobal().setLevel(Level.OFF);
        obj.logIt();
        obj.logIt();
        try {
            throw new ArithmeticException();
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, "third message");

        }
    }
}