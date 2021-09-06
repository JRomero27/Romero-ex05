package exercise05;

/*
 *  UCF COP3330 Fall 2021 Exercise 5 Solution
 *  Copyright 2021 Joshua Romero
 */

import java.util.Scanner;

public class solution05
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int firstNum = input.nextInt();

        System.out.println("What is the second number? ");
        int secondNum = input.nextInt();

        int ansOne = firstNum + secondNum;
        int ansTwo = firstNum - secondNum;
        int ansThree = firstNum * secondNum;
        int ansFour = firstNum / secondNum;

        System.out.println(firstNum + " + " + secondNum  + " = " + ansOne);
        System.out.println(firstNum + " - " + secondNum + " = " + ansTwo);
        System.out.println(firstNum + " * " + secondNum + " = " + ansThree);
        System.out.println(firstNum + " / " + secondNum + " = " + ansFour);

    }
}