package org.java_tutorials.function;

import java.util.*;

class Participant implements Comparable<Participant> {
    private int id;

    public Participant(int i) {
        id = i;
    }

    public String toString() {
        return "[" + id + "]";
    }


    // override method equals
    public boolean equals(Participant p) {
        return p.id == this.id;
    }

    // override method hashCode

    public int hashCode() {
        return super.hashCode();
    }

    // override method compareTo
    public int compareTo(Participant p) {
        if (p.id < this.id)
            return 1;
        else if (p.id > this.id)
            return -1;
        else
            return 0;
    }
}

class Submission {
    private Map<Participant, ArrayList<Integer>> aSbt;

    public Submission() {
        aSbt = new LinkedHashMap<Participant, ArrayList<Integer>>();
    }


    // Define method submit
    public void submit(Participant p, int n) {
        int c = 0;
        for (var x : aSbt.keySet()) {
            System.out.println(aSbt.get(x));
            if (x.toString().equals(p.toString())) {
                System.out.println("true");
                aSbt.get(x).add(n);
                c = 1;
                break;
            }
        }
        if (c == 0) {
            var v = new ArrayList<Integer>();
            v.add(n);
            aSbt.put(p, v);

        }
    }

    public Map<Participant, ArrayList<Integer>> getSubmissionDetails() {
        return aSbt;
    }


    // Define method getResult
    public LinkedHashMap<String, Integer> getResult() {
        LinkedHashMap<String, Integer> p = new LinkedHashMap<>();
        for (var x : aSbt.keySet()) {
            p.put(x.toString(), aSbt.get(x).get(aSbt.get(x).size() - 1));
        }
        return p;
    }


}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Submission pro = new Submission();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pro.submit(new Participant(sc.nextInt()), sc.nextInt());
        }
        System.out.println(pro.getSubmissionDetails());
        System.out.println(pro.getResult());
    }
}