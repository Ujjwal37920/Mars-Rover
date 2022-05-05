package mars.rover;

public class MarsRover {

    private int xCoordinate;
    private int yCoordinate;
    Direction d = Direction.NORTH;

    public void move(int x, int y, char dir, String instructions) {

        this.xCoordinate = x;
        this.yCoordinate = y;
        d = d.currentDirection(dir);

        if (!instructions.isEmpty()) {
            for (char instruction : instructions.toCharArray()) {

                if (instruction == 'L') {
                    d = d.rotateLeft();

                } else if (instruction == 'R') {
                    d = d.rotateRight();

                }
                else if (instruction == 'M') {
                    if (d.value() == 'N') {
                        yCoordinate += 1;
                    } else if (d.value() == 'S') {
                        yCoordinate -= 1;
                    } else if (d.value() == 'W') {
                        xCoordinate -= 1;
                    } else if (d.value() == 'E') {
                        xCoordinate += 1;
                    }
                }

            }

        }
    }

    public String getCurrentPosition(){
        return xCoordinate + " " + yCoordinate + " " + d.value();
    }




}
