package org.java_tutorials.tuition.shahir.monitor;

public class BankAccount {
    double[] accounts = new double[100];

    public synchronized boolean transfer(double amount, int source, int target) {
        while (accounts[source] < amount) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        accounts[source] -= amount;
        accounts[target] += amount;
        notifyAll();
        return true;
    }

    public double audit() {
        double balance = 0;
        for (int i = 0; i < 100; i++) {
            balance += accounts[i];
        }
        return balance;
    }

    public double currentBalance(int i) {
        return accounts[i];
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accounts[0] = 1000;
        new Thread(() -> {
            bankAccount.transfer(500, 0, 1);
            System.out.println(bankAccount.currentBalance(0));
        }).start();
        new Thread(() -> {
            bankAccount.transfer(300, 0, 1);
            System.out.println(bankAccount.currentBalance(0));
        }).start();
        new Thread(() -> {
            bankAccount.transfer(700, 0, 1);
            System.out.println("700 done");
            System.out.println(bankAccount.currentBalance(0));
        }).start();
        new Thread(() -> {
            bankAccount.transfer(800, 1, 0);
            System.out.println(bankAccount.currentBalance(0));
        }).start();
    }
}
