package ua.goit.java;

/**
 * Created by 7 on 06.04.2016.
 */
public class TriangleSquareCalculating {
    public static double triangleSquareCalculating(String SideAOfTriangle, String SideBOfTriangle) {
        int IntSideAOfTriangle = 4;
        int IntSideBOfTriangle = 4;
        double TriangleSquare;
        TriangleSquare = IntSideAOfTriangle*IntSideBOfTriangle/2;
        System.out.println("Area of a triangle is = "+TriangleSquare);
        return TriangleSquare;
    }
}