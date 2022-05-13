package mars.rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinateTest {

    @Test
    void shouldIncrementXCoordinatesWhenPositioveBooleanIsGiven() {
        Coordinate coordinate = new Coordinate(1, 2);
        int finalXCoordinatePosition  = 3;

        coordinate.moveX(true);
        coordinate.moveX(true);

        int actualXCoordinatePosition = coordinate.xCoordinate();
        assertEquals(actualXCoordinatePosition
        , finalXCoordinatePosition);
    }

    @Test
    void shouldIncrementYCoordinatesWhenPositioveBooleanIsGiven() {
        Coordinate coordinate = new Coordinate(3, 5);
        int finalYCoordinatePosition  = 3;

        coordinate.moveY(true);
        coordinate.moveY(true);

        int actualYCoordinatePosition = coordinate.xCoordinate();
        assertEquals(actualYCoordinatePosition
                , finalYCoordinatePosition);
    }

    @Test
    void shoulDecrementXCoordinatesWhenPositioveBooleanIsGiven() {
        Coordinate coordinate = new Coordinate(6, 2);
        int finalXCoordinatePosition  = 3;

        coordinate.moveX(false);
        coordinate.moveX(false);
        coordinate.moveX(false);

        int actualXCoordinatePosition = coordinate.xCoordinate();
        assertEquals(actualXCoordinatePosition
                , finalXCoordinatePosition);
    }

    @Test
    void shoulDecrementYCoordinatesWhenPositioveBooleanIsGiven() {
        Coordinate coordinate = new Coordinate(6, 4);
        int finalXCoordinatePosition  = 2;

        coordinate.moveY(false);
        coordinate.moveY(false);

        int actualXCoordinatePosition = coordinate.yCoordinate();
        assertEquals(actualXCoordinatePosition
                , finalXCoordinatePosition);
    }
}
