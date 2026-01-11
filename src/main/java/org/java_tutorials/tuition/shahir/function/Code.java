package org.java_tutorials.tuition.shahir.function;

import java.util.*;

class CricketPlayer {
    private String name;
    private int wickets;
    private int runs;
    private int matches;

    public CricketPlayer(String s, int w, int r, int m) {
        this.name = s;
        this.wickets = w;
        this.runs = r;
        this.matches = m;
    }

    public String getName() {
        return name;
    }

    public int getWickets() {
        return wickets;
    }

    public int getRuns() {
        return runs;
    }

    public double avgRuns() {
        return runs / matches;
    }

    public double avgWickets() {
        return wickets / matches;
    }
}

public class Code {
    public static void displayPlayers(ArrayList<CricketPlayer> bw, ArrayList<CricketPlayer> bt) {
        for (var v : bw) {
            if (!bw.getLast().getName().equals(v.getName()))
                System.out.print(v.getName() + " ");
            else
                System.out.println(v.getName());
        }
        for (var v : bt) {
            if (!bt.getLast().getName().equals(v.getName()))
                System.out.print(v.getName() + " ");
            else
                System.out.println(v.getName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(),
                sc.nextInt(), sc.nextInt());
        CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(),
                sc.nextInt(), sc.nextInt());
        CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(),
                sc.nextInt(), sc.nextInt());
        CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(),
                sc.nextInt(), sc.nextInt());

        // Define ArrayList objects here
        ArrayList<CricketPlayer> players = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
        ArrayList<CricketPlayer> bt = new ArrayList<>();
        ArrayList<CricketPlayer> bw = new ArrayList<>();
        for (CricketPlayer c : players) {
            if (c.avgRuns() > 25)
                bt.add(c);
            if (c.avgWickets() > 1)
                bw.add(c);
        }

        displayPlayers(bw, bt);
    }
}