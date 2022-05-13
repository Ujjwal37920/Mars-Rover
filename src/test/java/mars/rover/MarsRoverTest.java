package mars.rover;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {



    @Test
    void shouldReturnInitialPositionWhenNoCommandIsGiven() throws ExceedingPlateauBoundaryException {
        MarsRover marsRover=new MarsRover(5,5);
        String actualPosition = "0 0 N";

        marsRover.move(0,0, 'N',"");

        String finalPosition = marsRover.getCurrentPosition();
        assertEquals(actualPosition, finalPosition);
    }

    @ParameterizedTest
    @CsvSource({
            "0 0 N, 0 0 S",
            "0 0 E, 0 0 W"
    })

    void shouldChangeDirectionWhenRightInstructionIsGiven(String input,String output) throws ExceedingPlateauBoundaryException {
        MarsRover marsRover = new MarsRover(5,5);

       marsRover.move(Character.getNumericValue(input.charAt(0)),Character.getNumericValue(input.charAt(2)),input.charAt(4),"RR");

        String finalPosition = marsRover.getCurrentPosition();
        assertEquals(output, finalPosition);
    }

    @Test
    void shouldMoveInTheSameDirectionWhenNoDirectionInstructionIsGiven() throws ExceedingPlateauBoundaryException {
        MarsRover marsRover = new MarsRover(5,5);
        String actualPosition = "0 4 N";

        marsRover.move(0, 0, 'N', "MMMM");

        String finalPosition = marsRover.getCurrentPosition();
        assertEquals(actualPosition, finalPosition);
    }

    @Test
    void shouldMoveToCoordinates2And4FromInitialPosition() throws ExceedingPlateauBoundaryException {
        MarsRover marsRover = new MarsRover(5,5);
        String actualPosition = "4 2 E";
        String instruction = "MMRMMMM";

        marsRover.move(0,0,'N',instruction);

        String finalPosition = marsRover.getCurrentPosition();
        assertEquals(actualPosition, finalPosition);
    }

    @Test
    void shouldReturnExceedingPlateauBoundaryExceptionWhenExceedingMaxHeightMoveCommandIsGiven() {
        MarsRover marsRover = new MarsRover(5, 5);

        assertThrows(ExceedingPlateauBoundaryException.class, () -> marsRover.move(0,0,'N',"MMMMMMM"));
    }

    @Test
    void shouldReturnExceedingPlateauBoundaryExceptionWhenExceedingMinHeightMoveCommandIsGiven() {
        MarsRover marsRover = new MarsRover(5, 5);

        assertThrows(ExceedingPlateauBoundaryException.class, () -> marsRover.move(0,0,'S',"MM"));
    }
    @Test
    void shouldReturnExceedingPlateauBoundaryExceptionWhenExceedingMaxLengthMoveCommandIsGiven() {
        MarsRover marsRover = new MarsRover(5, 5);

        assertThrows(ExceedingPlateauBoundaryException.class, () -> marsRover.move(0,0,'N',"MMRMMMMMM"));
    }

    @Test
    void shouldReturnExceedingPlateauBoundaryExceptionWhenExceedingMinLengthMoveCommandIsGiven() {
        MarsRover marsRover = new MarsRover(5, 5);

        assertThrows(ExceedingPlateauBoundaryException.class, () -> marsRover.move(0,0,'N',"MMLMMMMMM"));
    }


}