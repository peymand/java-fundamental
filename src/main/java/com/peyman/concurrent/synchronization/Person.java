package com.peyman.concurrent.synchronization;

public class Person {


    public synchronized void study() {
        System.out.println("dummy");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("x");
    }

    public void run(){
        notifyAll();
        System.out.println("run");
    }
}
