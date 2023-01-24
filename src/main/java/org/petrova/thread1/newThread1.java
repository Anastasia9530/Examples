package org.petrova.thread1;

import org.petrova.common.Utils;

public class newThread1 implements Runnable {

    public static void main(String[] args) {

        Thread t1 = new Thread(new newThread1());
        Thread t2 = new Thread(new newThread1());
        Thread t3 = new Thread(new newThread1());

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                Utils.log("count = " + i);
            }
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
