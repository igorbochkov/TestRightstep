package com.app.testRightstep.util;

import com.app.testRightstep.model.*;

import java.util.List;

public class FigureTestData {

    public static final Circle CIRCLE1 = new Circle(Color.GREEN, 1.0);
    public static final Circle CIRCLE2 = new Circle(Color.BLUE, 2.0);
    public static final Circle CIRCLE3 = new Circle(Color.GREY, 3.0);
    public static final Circle CIRCLE4 = new Circle(Color.GREEN, 4.0);

    public static final Rectangle RECTANGLE1 = new Rectangle(Color.YELLOW, 1.0, 1.0);
    public static final Rectangle RECTANGLE2 = new Rectangle(Color.BLACK, 1.0, 2.0);
    public static final Rectangle RECTANGLE3 = new Rectangle(Color.RED, 2.0, 1.0);
    public static final Rectangle RECTANGLE4 = new Rectangle(Color.WHITE, 2.0, 2.0);

    public static final Triangle TRIANGLE1 = new Triangle(Color.YELLOW, 1.0, 1.0);
    public static final Triangle TRIANGLE2 = new Triangle(Color.BLUE, 1.0, 2.0);
    public static final Triangle TRIANGLE3 = new Triangle(Color.RED, 2.0, 1.0);
    public static final Triangle TRIANGLE4 = new Triangle(Color.GREEN, 2.0, 2.0);

    public static List<Circle> getCircles() {
        return List.of(CIRCLE1, CIRCLE2, CIRCLE3, CIRCLE4);
    }

    public static List<Rectangle> getRectangles() {
        return List.of(RECTANGLE1, RECTANGLE2, RECTANGLE3, RECTANGLE4);
    }

    public static List<Triangle> getTriangles() {
        return List.of(TRIANGLE1, TRIANGLE2, TRIANGLE3, TRIANGLE4);
    }

    public static List<Figure> getAllFigures() {
        return List.of(CIRCLE1, CIRCLE2, CIRCLE3, CIRCLE4,
                RECTANGLE1, RECTANGLE2, RECTANGLE3, RECTANGLE4,
                TRIANGLE1, TRIANGLE2, TRIANGLE3, TRIANGLE4);
    }

}
