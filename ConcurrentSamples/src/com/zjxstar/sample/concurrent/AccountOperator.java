package com.zjxstar.sample.concurrent;

public class AccountOperator implements Runnable {

    private Account mAccount;

    public AccountOperator(Account account) {
        this.mAccount = account;
    }

    @Override
    public void run() {
        synchronized (mAccount) {
            mAccount.deposit(100);
            mAccount.withdraw(100);
            System.out.println(Thread.currentThread().getName() + " : " + mAccount.getBalance());
        }
    }
}
