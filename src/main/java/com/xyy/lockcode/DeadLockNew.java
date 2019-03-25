package com.xyy.lockcode;

public class DeadLockNew {

    private static Object lockA = new Object();
    private static Object lockB = new Object();

    public static void main(String[] args) {
        new DeadLockNew().deadLockNew();
    }

    public void deadLockNew() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                getLock();
            }
        }, "Thread1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                getLock();
            }
        }, "Thread2");

        thread1.start();
        thread2.start();
    }

    public void getLock() {
        synchronized (lockA) {
            try {
                System.out.println(Thread.currentThread().getName() + "获取A锁 ing!");
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + "A锁睡眠500ms");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "需要B锁!");
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "获取B锁成功!");
            }
        }

    }

}
