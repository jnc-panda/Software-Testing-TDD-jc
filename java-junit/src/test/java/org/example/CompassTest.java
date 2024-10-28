package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import static org.example.Direction.*;
//import static org.example.Point.*;
import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.*;

class CompassTest {


  @Test
    @DisplayName("returns East when passed North Point and Right Direction ")
    // returns East when passed North Point and Right Direction
    public void compassFacingNorthCanRotateRight() {
        Compass.Point resultOutput;

        resultOutput = Compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT);
        assertEquals(Compass.Point.EAST, resultOutput );
    }


    @Test
    @DisplayName("Returns correct point when rotating right ")
    // returns East when passed North Point and Right Direction
    public void compassCanRotateRight() {
        Compass.Point resultOutput;

        Compass.Point northResultOutput = Compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT);
        Compass.Point southResultOutput = Compass.rotate(Compass.Point.SOUTH, Compass.Direction.RIGHT);
        Compass.Point eastResultOutput = Compass.rotate(Compass.Point.EAST, Compass.Direction.RIGHT);
        Compass.Point westResultOutput = Compass.rotate(Compass.Point.WEST, Compass.Direction.RIGHT);

        assertAll(
                () -> assertEquals(Compass.Point.EAST, northResultOutput),
                () -> assertEquals(Compass.Point.WEST, southResultOutput),
                () -> assertEquals(Compass.Point.SOUTH, eastResultOutput),
                () -> assertEquals(Compass.Point.NORTH, westResultOutput)


                );


    }

    @Test
    @DisplayName("Returns correct point when rotating right ")
    // returns East when passed North Point and Right Direction
    public void compassCanRotateLeft() {
        Compass.Point resultOutput;

        Compass.Point northResultOutput = Compass.rotate(Compass.Point.NORTH, Compass.Direction.LEFT);
        Compass.Point southResultOutput = Compass.rotate(Compass.Point.SOUTH, Compass.Direction.LEFT);
        Compass.Point eastResultOutput = Compass.rotate(Compass.Point.EAST, Compass.Direction.LEFT);
        Compass.Point westResultOutput = Compass.rotate(Compass.Point.WEST, Compass.Direction.LEFT);

        assertAll(
                () -> assertEquals(Compass.Point.WEST, northResultOutput),
                () -> assertEquals(Compass.Point.EAST, southResultOutput),
                () -> assertEquals(Compass.Point.NORTH, eastResultOutput),
                () -> assertEquals(Compass.Point.SOUTH, westResultOutput)


        );


    }

}
