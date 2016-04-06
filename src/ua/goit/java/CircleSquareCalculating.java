package ua.goit.java;

/**
 * Created by 7 on 06.04.2016.
 */
public class CircleSquareCalculating {
    public static double circleSquareCalculating(String R) {
        final int radius = 4;
//        radius = 4;
        int radius1 = radius;
        double CircleSquare;
        double Pi = 3.14d;
        CircleSquare = Pi*radius*radius;
        System.out.println("Area of a cirlce = "+CircleSquare);
        return CircleSquare;
    }
}