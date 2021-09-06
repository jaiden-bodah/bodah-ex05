/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise05.solution05;

/*
Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers
 */

import java.util.Scanner;

public class Application {

    /*
create a program that prompts for the input of two numbers
    read in the two inputs provided
    store the inputs
     uses the inputs to calculate the sum, difference, product, and quotient of the numbers
     print out the values of the equations
     */

    public static void main (String[] args)

    {
        System.out.println("What is the first number? ");
        System.out.println("What is the second number? ");

        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();

        int num2=sc.nextInt();

        int sum=num1+num2;

        int product=num1*num2;

        int difference=num1-num2;

        int quotient=num1/num2;

        System.out.println("The sum is " + sum + "\n" + "The difference is " + difference + "\n" + "The product is " + product + "\n" + "The quotient " + quotient);
    }

}