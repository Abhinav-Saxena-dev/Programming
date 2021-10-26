package com.java.Threading;

import javax.print.attribute.standard.PrinterResolution;

public class SyncApp {

    public static class Printer{

        void printDoc(int num, String docName){
            for(int i = 0; i < num; i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                System.out.println("Doctumert -> " +docName+" "+i);
            }
        }
    }
    public static class MineThread extends Thread{
        Printer print_T;
        public MineThread(Printer print){
            print_T = print;
        }
        @Override
        public void run(){
            print_T.printDoc(7, "BabuRaoBanarsi");
        }
    }

    public static class YourThread extends Thread{
        Printer print_T;
        public YourThread(Printer print){
            print_T = print;
        }
        @Override
        public void run(){
            print_T.printDoc(7, "Hamuna@@");
        }
    }
    public static void main(String[] args) {

        System.out.println("==Application Started==");

        Printer print = new Printer();
//        print.printDoc(5, "Hijadh");

        MineThread mref = new MineThread(print);
        mref.start();

        YourThread yref = new YourThread(print);
        yref.start();

        System.out.println("==Application Ended==");
    }
}
