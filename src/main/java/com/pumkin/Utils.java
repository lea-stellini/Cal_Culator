package com.pumkin;


import java.util.Scanner;

public class Utils {
    public static boolean askToContinue(Scanner scanner){
        System.out.println("Do you want to crunch more numbers ?  (yes/no)");
        String response = scanner.nextLine().trim().toLowerCase();

        return response.equals("yes") || response.equals("y");
    }

    public static double getUserNumber(Scanner scanner, String message){

        while(true) {
            System.out.println(message);
            String input = scanner.nextLine();

            try{
                return Double.parseDouble(input);
            } catch(NumberFormatException e){
                System.out.println("That's not a valid number. Try again, buddy!");
            }
        }
    }

    public static String getUserOperator(Scanner scanner){

        while (true) {
            System.out.println("And what do you want to do with them ? Please enter one of those : + , - , * , /");
            String op = scanner.nextLine().trim();

            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")){
                return op;
            }else{
                System.out.println("Ugh, I only do basic math. Try one of those: +, -, *, /");
            }
        }

    }
}
