package ua.goit.java;

/**
 * Created by 7 on 06.04.2016.
 */
public class RectangleSquareCalculating {
    public static double rectangleSquareCalculating(String SideAOfRectangle, String SideBOfRectangle) {
        int IntSideAOfRectangle = 4;
        int IntSideBOfRectangle = 4;
        double RectangleSquare;
        RectangleSquare = IntSideAOfRectangle*IntSideBOfRectangle;
        System.out.println("Square Area is = "+RectangleSquare);
        return RectangleSquare;
    }

}
