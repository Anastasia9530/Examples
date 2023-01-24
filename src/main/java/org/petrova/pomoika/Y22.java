package org.petrova.pomoika;

import org.petrova.common.Utils;

import java.util.concurrent.Callable;

public class Y22 implements Runnable {
    static Integer count = 0;

    public Y22() {
    }

    public static void main(String[] args) {


//        Thread thread1 = new Thread(new Y22()); // создаем главный поток
//        Thread thread3 = new Thread(() -> Utils.log2("thread3 RUUUNNN"));

//        thread1.start();
//        thread2.start();
//        thread3.start();

        var y22 = new Y22();

        for (int i = 0; i < 10; i++) {

            Thread thread4 = new Thread(y22);
            thread4.start();
        }
//            ExecutorService executorService = Executors.newFixedThreadPool(3);// создали менеджер потоков
//            executorService.submit(thread1);
//            executorService.submit(thread2);
//            executorService.submit(thread3);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        Utils.log("Run thread = " + thread1.getName()); // вернули имя потока
//        Utils.log(thread1 + ""); // напечатали все о потоке
//        Utils.log("isAlive thread1: " + thread1.isAlive()); // используется ли поток1?
//        Utils.log("isAlive thread2: " + thread2.isAlive()); // используется ли поток2?
        
        Utils.log2("count: " + count);
    }

    @Override
    public void run() {

        Utils.log2("---->");
        // ------------------------------------------------------------------

        incrementCount();
        decrementCount();

        // ------------------------------------------------------------------
        Utils.log2("<----");
    }

    public synchronized void incrementCount() {
        Utils.log2("sync inc: ");
        for (int i = 0; i < 10000; i++) {
            count++;
        }
        Utils.log2("sync inc <---");
    }

    public static synchronized void decrementCount() {
        Utils.log2("sync dec: ");
        for (int i = 0; i < 10000; i++) {
            count--;
        }
        Utils.log2("sync dec <---");
    }

    public void decrementCount1() {
        synchronized (this) {
            Utils.log2("sync dec");
            for (int i = 0; i < 10000; i++) {
                count--;
            }
        }
    }
}