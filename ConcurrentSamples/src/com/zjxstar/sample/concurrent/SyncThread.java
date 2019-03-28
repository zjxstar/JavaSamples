package com.zjxstar.sample.concurrent;

public class SyncThread implements Runnable {
    private static int count;

    public SyncThread() {
        count = 0;
    }


    @Override
    public void run() {
        // 同步代码块，作用对象：调用这个代码块的对象
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

    public int getCount() {
        return count;
    }
}
