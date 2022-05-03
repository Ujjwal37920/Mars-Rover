package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void
    acceptance_test_1() {
        String newPosition = MarsRover.move(1, 2, 'N', "LMLMLMLMM");
        assertEquals("1 3 N", newPosition);
    }

    @Test
    void shouldReturnInitialPositionWhenNoCommandIsGiven() {
        MarsRover marsRover=new MarsRover();
        String actualPosition = "0 0 N";

        String finalPosition = marsRover.move(0,0, 'N',"");

        assertEquals(actualPosition, finalPosition);
    }

    @Test
    void shouldFaceEastWhenRightInstructionIsGiven() {
        MarsRover marsRover = new MarsRover();
        String actualPosition = "0 0 E";

        String finalPosition = marsRover.move(0,0,'N',"R");

        assertEquals(actualPosition, finalPosition);
    }

    @Test
    void shouldMoveInTheSameDirectionWhenNoDirectionInstructionIsGiven() {
        MarsRover marsRover = new MarsRover();
        String actualPosition = "0 4 N";

        String finalPosition = marsRover.move(0, 0, 'N', "MMMM");

        assertEquals(actualPosition, finalPosition);
    }

    @Test
    public void acceptance_test_2() {
        String newPosition = MarsRover.move(3, 3, 'E', "MMRMMRMRRM");
        assertEquals("5 1 E", newPosition);
    }

}