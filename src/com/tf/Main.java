package com.tf;

public class Main {
    public static void main(String[] args) {
        int count = 1;

        while (true) {
            if (count >= 25) {
                break;
            }

            System.out.println(count);
            count = count + 1;
        }
    }

}