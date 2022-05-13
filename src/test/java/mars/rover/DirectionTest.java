package mars.rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @Test
    void shouldRotateRight() {
        Direction direction = Direction.NORTH;
        char expectedPosition = 'E';

        Direction actualPosition = direction.rotateRight();

        char finalPosition = actualPosition.value();
        assertEquals(expectedPosition, finalPosition);

    }

    @Test
    void shouldRotateLeft() {
        Direction direction = Direction.NORTH;
        char expectedPosition = 'W';

        Direction actualPosition = direction.rotateLeft();

        char finalPosition = actualPosition.value();
        assertEquals(expectedPosition, finalPosition);

    }
}
