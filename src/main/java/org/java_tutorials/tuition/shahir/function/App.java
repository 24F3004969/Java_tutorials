package org.java_tutorials.tuition.shahir.function;

import org.java_tutorials.tuition.shahir.monitor.FunSide;

public class App extends FunSide {
    @Override
    protected boolean isWanted() {
        if (wanted.equals("wanted")) {
            return true;
        }
        return false;
    }
}
