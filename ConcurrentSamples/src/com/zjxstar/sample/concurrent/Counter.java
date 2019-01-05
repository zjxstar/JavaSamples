package com.zjxstar.sample.concurrent;

public class Counter implements Runnable {

    private int count = 0;

    public Counter() {
        count = 0;
    }

    public void countAdd() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printCount() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "count: " + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if ("A".equals(threadName)) {
            countAdd();
        } else {
            printCount();
        }
    }
}
