package mars.rover;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {



    @Test
    void shouldReturnInitialPositionWhenNoCommandIsGiven() {
        MarsRover marsRover=new MarsRover();
        String actualPosition = "0 0 N";

        String finalPosition = marsRover.move(0,0, 'N',"");

        assertEquals(actualPosition, finalPosition);
    }

    @ParameterizedTest
    @CsvSource({
            "0 0 N, 0 0 E",
            "0 0 E, 0 0 S"
    })

    void shouldFaceEastWhenRightInstructionIsGiven(String input,String output) {
        MarsRover marsRover = new MarsRover();

       String finalPosition = marsRover.move(Character.getNumericValue(input.charAt(0)),Character.getNumericValue(input.charAt(2)),input.charAt(4),"R");

        assertEquals(output, finalPosition);
    }

    @Test
    void shouldMoveInTheSameDirectionWhenNoDirectionInstructionIsGiven() {
        MarsRover marsRover = new MarsRover();
        String actualPosition = "0 4 N";

        String finalPosition = marsRover.move(0, 0, 'N', "MMMM");

        assertEquals(actualPosition, finalPosition);
    }

    @Test
    void shouldNotCrossTheLongitudinalBoundaryOfPlateau() {
    }



}