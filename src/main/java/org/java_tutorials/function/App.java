package org.java_tutorials.function;

import org.java_tutorials.monitor.FunSide;

public class App extends FunSide {
    @Override
    protected boolean isWanted() {
        if (wanted.equals("wanted")) {
            return true;
        }
        return false;
    }
}
