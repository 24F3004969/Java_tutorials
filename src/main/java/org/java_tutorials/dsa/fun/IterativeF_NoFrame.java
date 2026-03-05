package org.java_tutorials.dsa.fun;
import java.util.ArrayDeque;
import java.util.Deque;

public class IterativeF_NoFrame {
    static void fIter(int n) {
        Deque<Integer> ns = new ArrayDeque<>();
        Deque<Integer> stages = new ArrayDeque<>(); // 0 = do f(n-1), 1 = do f(n-2)

        ns.push(n);
        stages.push(0);

        while (!ns.isEmpty()) {
            System.out.println(ns+","+stages);
            int curN = ns.pop();
            int stage = stages.pop();

            if (curN <= 0) continue;

            if (stage == 0) {
                // emulate: f(n-1); f(n-2)
                ns.push(curN);      stages.push(1);    // come back to do right
                ns.push(curN - 1);  stages.push(0);    // do left
                // (Preorder work would go here if needed)
            } else {
                ns.push(curN - 2);  stages.push(0);    // do right
                // (Postorder work would go here if you add another stage)
            }
        }
    }

    public static void main(String[] args) {
        fIter(5);
    }
}