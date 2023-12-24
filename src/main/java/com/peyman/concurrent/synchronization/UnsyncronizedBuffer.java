package com.peyman.concurrent.synchronization;

/**
 * Created by Peyman on 12/16/2017.
 */
public class UnsyncronizedBuffer implements Buffer {

    private int buffer = -1; //shared by producer and threads

    @Override
    public synchronized void blockingPut(int value) throws InterruptedException {
        System.out.printf("Producer writes\t%2d",value);
        buffer = value;
    }

    @Override
    public synchronized int blockingGet() throws InterruptedException {
        System.out.printf("Consumer reads\t\t\t%2d",buffer);
        return buffer;
    }
}
