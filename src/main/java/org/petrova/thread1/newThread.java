package org.petrova.thread1;

import org.petrova.common.Utils;

public class newThread extends Thread implements Runnable {

    public static void main(String[] args) {

        Thread thread = new Thread(new newThread());

        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i<100; i++){
            Utils.log("=)");
        }
    }
}
