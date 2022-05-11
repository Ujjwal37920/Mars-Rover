package mars.rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinateTestClass {

    @Test
    void shouldIncrementXCoordinatesWhenPositioveBooleanIsGiven() {
        Coordinate coordinate = new Coordinate(1, 2);
        int finalXCoordinatePosition  = 3;

        coordinate.moveX(true);
        coordinate.moveX(true);

        int actualXCoordinatePosition = coordinate.x();
        assertEquals(actualXCoordinatePosition
        , finalXCoordinatePosition);
    }

    @Test
    void shouldIncrementYCoordinatesWhenPositioveBooleanIsGiven() {
        Coordinate coordinate = new Coordinate(3, 5);
        int finalYCoordinatePosition  = 3;

        coordinate.moveY(true);
        coordinate.moveY(true);

        int actualYCoordinatePosition = coordinate.x();
        assertEquals(actualYCoordinatePosition
                , finalYCoordinatePosition);
    }
}
