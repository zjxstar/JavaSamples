package com.zjxstar.sample.concurrent;

public class Main {

    public static void main(String[] args) {
        // 两个并发线程访问同一个对象的同步代码块时，会阻塞
//        SyncThread syncThread = new SyncThread();
//        Thread thread1 = new Thread(syncThread, "Thread1");
//        Thread thread2 = new Thread(syncThread, "Thread2");
//        thread1.start();
//        thread2.start();

        // 两个线程访问的不是同一个对象，所以不会阻塞
//        Thread thread3 = new Thread(new SyncThread(), "Thread3");
//        Thread thread4 = new Thread(new SyncThread(), "Thread4");
//        thread3.start();
//        thread4.start();

        // 一个线程访问对象的Synchronized代码块时，另一个线程可以访问该对象的其他非Synchronized代码
//        Counter counter = new Counter();
//        Thread thread1 = new Thread(counter, "A");
//        Thread thread2 = new Thread(counter, "B");
//        thread1.start();
//        thread2.start();

        // 给某个对象加锁
//        Account account = new Account("HaHa", 1000f);
//        AccountOperator operator = new AccountOperator(account);
//        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(operator, "Thread" + i);
//            thread.start();
//        }

//        Bank bank = new Bank(5555);
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                bank.changeBalance(1000);
//                bank.getBalance("A");
//            }
//        },"A");
//        t1.start();
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                bank.getBalance("B");
//            }
//        }, "B");
//        t2.start();
//
//        Thread t3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                bank.changeBalance(2000);
//                bank.getBalance("C");
//            }
//        }, "C");
//        t3.start();

        SyncThreadB syncThreadB1 = new SyncThreadB();
        SyncThreadB syncThreadB2 = new SyncThreadB();
        Thread thread1 = new Thread(syncThreadB1, "AA");
        Thread thread2 = new Thread(syncThreadB2, "BB");
        thread1.start();
        thread2.start();
    }

}
