package org.example;

public class Compass {

    public static Point rotate(Point startPoint, Direction newDirection){
        Point resultOutput = null;

        if (startPoint.equals(Compass.Point.NORTH) && newDirection.equals(Compass.Direction.RIGHT)){
            resultOutput = Compass.Point.EAST;
        }
        if (startPoint.equals(Point.SOUTH) && newDirection.equals(Compass.Direction.RIGHT)){
            resultOutput = Point.WEST;
        }
        if (startPoint.equals(Point.EAST) && newDirection.equals(Compass.Direction.RIGHT)){
            resultOutput = Point.SOUTH;
        }
        if (startPoint.equals(Point.WEST) && newDirection.equals(Compass.Direction.RIGHT)){
            resultOutput = Point.NORTH;
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
