package ua.goit.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 7 on 06.04.2016.
 */
public class SquareCalculateTest {

    @Test (timeout = 1000)
    public void testCircleSquareCalculating(){
        int r = 4;
        double testCircleSquare = 3.14d * r * r;

        Assert.assertEquals(testCircleSquare, CircleSquareCalculating.circleSquareCalculating("R"),1);
    }

    @Test (timeout = 1000)
    public void testRectangleSquareCalculating(){
        int a = 4;
        int b = 4;
        double testRectangleSquare = a * b;

        Assert.assertEquals(testRectangleSquare, RectangleSquareCalculating.rectangleSquareCalculating("a","b"),1);
    }
    @Test (timeout = 1000)
    public void testTriangleleSquareCalculating(){
        int a = 4;
        int b = 4;
        double testTriangleSquare = (a * b)/2;

        Assert.assertEquals(testTriangleSquare, TriangleSquareCalculating.triangleSquareCalculating("a","b"),1);
    }
}