package com.atdev;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt){
        return scanner.nextDouble();
    }
    //Read Number
    public static double readNumber(String prompt, double min, double max){
        double value;
        while (true){
            System.out.print(prompt);
            value = scanner.nextInt();
            if(value>= min && value <= max)
                break;
            System.out.println("Enter a value between "+min+" and "+max);
        }
        return value;
    }
}
