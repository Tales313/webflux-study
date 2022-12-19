package com.example.webfluxdemo.service;

public class SleepUtil {

    public static void sleedSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
