/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is the first number? " );
        String input1 =  scan.nextLine();

        System.out.print( "What is the second number? " );
        String input2 =  scan.nextLine();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        System.out.println( num1 + " + " + num2 + " = " + (num1 + num2) );
        System.out.println( num1 + " - " + num2 + " = " + (num1 - num2) );
        System.out.println( num1 + " * " + num2 + " = " + (num1 * num2) );
        System.out.println( num1 + " / " + num2 + " = " + (num1 / num2) );
    }
}
