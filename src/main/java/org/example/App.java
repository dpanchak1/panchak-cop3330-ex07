/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        double feetToMeters= 0.09290304;
        System.out.print("What is the length of the room in feet? ");
        int len=input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int wid=input.nextInt();
        System.out.printf("You entered dimensions of %d feet by %d feet.%n", len, wid);

        int sqFeet=len*wid;
        double sqMeters=sqFeet*feetToMeters;

        System.out.printf("%d square feet%n", sqFeet);
        System.out.printf("%.03f square meters",sqMeters);


    }
}
