package com.pumkin;

public class Calculator {
    public static double add(double a, double b) {
        return a + b ;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }

    public static boolean isWhole(double number){
        return number % 1 == 0;
    }
}
