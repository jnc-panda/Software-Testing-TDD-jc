package org.example;

public class Compass {

    public static Point rotate(Point startPoint, Direction newDirection){
        Point resultOutput = null;



        if (startPoint.equals(Compass.Point.NORTH) && newDirection.equals(Compass.Direction.RIGHT)){
            resultOutput = Compass.Point.EAST;

        }
        return resultOutput;

    }

    public enum Point {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public enum Direction {
        LEFT,
        RIGHT

    }
}
