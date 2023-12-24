package com.peyman.concurrent.synchronization;

/**
 * Created by Peyman on 12/16/2017.
 */
public class SyncronizedBuffer implements Buffer {

    private int buffer = -1; //shared by producer and threads
    private boolean occupied = false;

    @Override
    public synchronized void blockingPut(int value) throws InterruptedException {
        while (occupied) {
            System.out.println("Producer tries to write.");
            this.wait();
        }
        buffer = value;
        System.out.printf("Producer writes\t%2d", value);
        occupied = true;
        notifyAll();
    }

    @Override
    public synchronized int blockingGet() throws InterruptedException {

        while (!occupied) {
            System.out.println("Consumer tries to read.");
            wait();
        }
        System.out.printf("Consumer reads\t\t\t%2d", buffer);
        occupied = false;
        notifyAll();
        return buffer;
    }
}
