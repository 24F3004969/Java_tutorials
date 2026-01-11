package org.java_tutorials.tuition.shahir.part_1.tutorials_10;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class EvaluateString {
    public static void main(String[] args) throws ScriptException {
        String x;
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("js");
        String expression;
        do {
            System.out.println("Enter a expression");
            expression = new Scanner(System.in).nextLine();
            if (!expression.equals("exit")) {
                System.out.println(expression);
                x = engine.eval(expression).toString();
                System.out.println(x);
            }
        }
        while (!expression.equals("exit"));
    }
}
