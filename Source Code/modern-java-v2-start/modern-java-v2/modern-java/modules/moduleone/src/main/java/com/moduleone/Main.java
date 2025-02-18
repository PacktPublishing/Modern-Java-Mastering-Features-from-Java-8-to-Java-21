package com.moduleone;

public class Main {
    public static void main(String[] args) {
        System.out.println("I am from module 1");
        System.out.println(Main.class.getModule().getName());
    }
}
