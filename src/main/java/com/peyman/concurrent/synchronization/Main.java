package com.peyman.concurrent.synchronization;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {


    public static void main(String[] args) throws InterruptedException {


        Person p = new Person();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                p.study();
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                p.run();
            }
        });
        t2.start();

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton button1 = new JButton("Print");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 10000000 ; i++) {
                            System.out.println("#####");
                        }
                    }
                });

                t.start();


            }
        });
        frame.add(button1);
        JButton button2 = new JButton("download");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 10000000 ; i++) {
                            System.out.println("$$$$$$$$$");
                        }
                    }
                });

                t.start();
            }
        });
        frame.add(button2);

    }
}
