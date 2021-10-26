package com.java.Threading;

public class UseThreads extends Thread {
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(" @@ Printing docs ##");
        }
    }
}
