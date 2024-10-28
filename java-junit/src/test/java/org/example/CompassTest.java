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
}
