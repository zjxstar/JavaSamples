package com.zjxstar.sample.concurrent;

public class Bank {

    float balance;

    public Bank(float balance) {
        this.balance = balance;
    }

    public synchronized void changeBalance(float amount) {
        balance += amount;
    }

    public synchronized void getBalance(String threadName) {
        System.out.println(threadName + " : " + balance);
    }

}
