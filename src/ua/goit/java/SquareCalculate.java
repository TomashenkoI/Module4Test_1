package ua.goit.java;

import java.util.Scanner;

/**
 * Created by 7 on 06.04.2016.
 */
public class SquareCalculate {

    public static void main(String[] args) {

        Scanner inputtedRadius = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        final String R = inputtedRadius.next();


        try {
            CircleSquareCalculating.circleSquareCalculating(R);
        }
        catch (NumberFormatException ex) {
            System.out.println("Radius should be a number!");
        }

        System.out.println();

        Scanner inputtedSideA = new Scanner(System.in);
        System.out.println("Enter size of rectangle's side A:");
        final String SideAOfRectangle = inputtedSideA.next();

        Scanner inputtedSideB = new Scanner(System.in);
        System.out.println("Enter size of rectangle's side B:");
        final String SideBOfRectangle = inputtedSideB.next();

        try {
            RectangleSquareCalculating.rectangleSquareCalculating(SideAOfRectangle,SideBOfRectangle);
        }
        catch (NumberFormatException ex) {
            System.out.printf("Size should be a number!");
        }

        System.out.println();

        Scanner inputtedSideAOfTriangle = new Scanner(System.in);
        System.out.println("Enter size of triangle's size A:");
        final String SideAOfTriangle = inputtedSideAOfTriangle.next();

        Scanner inputtedSideBOfTriangle = new Scanner(System.in);
        System.out.println("Enter size of triangle's size B:");
        final String SideBOfTriangle = inputtedSideBOfTriangle.next();

        try {
            TriangleSquareCalculating.triangleSquareCalculating(SideAOfTriangle, SideBOfTriangle);
        }
        catch (NumberFormatException ex) {
            System.out.println("Size should be a number!");
        }
    }
}