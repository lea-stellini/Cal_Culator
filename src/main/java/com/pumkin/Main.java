package com.pumkin;

import java.util.Scanner;

import static com.pumkin.Calculator.*;
import static com.pumkin.Utils.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        printIntro();

        while(keepGoing){
            double number1 = getUserNumber(scanner, "So what's your first number ?");
            double number2 = getUserNumber(scanner, "The second ?");
            String operator = getUserOperator(scanner);

            processCalculation(number1, number2, operator);

            keepGoing = askToContinue(scanner);

        }

        System.out.println("Okay, I'm off to recharge my circuits. Bye!");
        scanner.close();

    }

    private static void printIntro(){
        System.out.println("I'm Cal, Cal Culator, let's crunch some numbers together !");
    }





    private static void processCalculation(double number1, double number2, String operator){
        double result = 0;
        boolean valid = true;

        String texteResult = String.format("Mmh %.2f %s %.2f, do you really need me to crunch that ?! Well, the result is ", number1, operator, number2);

        switch (operator){
            case "+":
                result = add(number1, number2);
                break;
            case "-":
                result = subtract(number1, number2);
                break;
            case "*":
                result = multiply(number1, number2);
                break;
            case "/":
                try {
                    result = divide(number1, number2);
                    break;
                } catch (ArithmeticException e){
                    System.out.println("Nice try. But division by zero ? Nope.");
                    valid = false;
                    break;
                }
            default:
                System.out.println("Mmmh too difficult for me, bye!");
                valid = false;
        }

        if(valid){
            if(isWhole(result)){
                System.out.printf(texteResult + "%.0f\n", result);
            } else {
                System.out.printf(texteResult + "%.2f\n", result);
            }
        }
    }
}