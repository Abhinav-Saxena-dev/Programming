package com.java.Random;

public class PatternDia{
    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        do{
            i++;
            if(j-- < i++){
                break;
            }
        } while(i < 3);
        System.out.println(i + " " + j);
    }
}
