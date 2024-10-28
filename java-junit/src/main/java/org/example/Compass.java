package org.example;

public class Compass {

    public static Point rotate(Point startPoint, Direction newDirection){
        Point resultOutput = null;

        if(newDirection == Direction.RIGHT) {
            switch(startPoint) {
                case NORTH -> resultOutput = Point.EAST;
                case SOUTH -> resultOutput = Point.WEST;
                case EAST -> resultOutput = Point.SOUTH;
                case WEST -> resultOutput = Point.NORTH;
            }
        } else {
            switch (startPoint) {
                case NORTH -> resultOutput = Point.WEST;
                case SOUTH -> resultOutput = Point.EAST;
                case EAST -> resultOutput = Point.NORTH;
                case WEST -> resultOutput = Point.SOUTH;
            }
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
