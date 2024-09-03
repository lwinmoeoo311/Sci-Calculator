package org.main;

import java.util.Scanner;

public class Main {

    static boolean inputFlg = true;

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        while (inputFlg) {
            Scanner scanner = new Scanner(System.in);
            calculator.isNumber(scanner.nextLine());
            System.out.println(CalculationContainer.getPrompt());

            if (CalculationContainer.FINISHED_OPERATION) {
                System.out.println("=> " + CalculationContainer.getResult());
            }
        }
        System.out.println("No input is accepted");
    }
}