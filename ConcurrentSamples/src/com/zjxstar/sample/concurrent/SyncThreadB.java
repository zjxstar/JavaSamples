package com.zjxstar.sample.concurrent;

public class SyncThreadB implements Runnable {

    private static int count;

    public SyncThreadB() {
        count = 0;
    }

    public synchronized static void method() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ ":" + (count++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void method2() {
        synchronized (SyncThreadB.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+ ":" + (count++));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
//        method();

        method2();
    }
}
