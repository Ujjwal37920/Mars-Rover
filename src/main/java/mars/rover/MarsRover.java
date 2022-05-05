package mars.rover;

public class MarsRover {

    private char direction;
    private int xCoordinate;
    private int yCoordinate;

    public void move(int x, int y, char dir, String instructions) {

        this.xCoordinate = x;
        this.yCoordinate = y;
        this.direction = dir;

        if (!instructions.isEmpty()) {
            for (char instruction : instructions.toCharArray()) {
                if (instruction == 'L') {
                    if (direction == 'N') {
                        direction = 'W';
                    } else if (direction == 'W') {
                        direction = 'S';
                    } else if (direction == 'S') {
                        direction = 'E';
                    } else if (direction == 'E') {
                        direction = 'N';
                    }
                } else if (instruction == 'R') {
                    if (direction == 'N') {
                        direction = 'E';
                    } else if (direction == 'W') {
                        direction = 'N';
                    } else if (direction == 'S') {
                        direction = 'W';
                    } else if (direction == 'E') {
                        direction = 'S';
                    }
                } else if (instruction == 'M') {
                    if (direction == 'N') {
                        yCoordinate += 1;
                    } else if (direction == 'S') {
                        yCoordinate -= 1;
                    } else if (direction == 'W') {
                        xCoordinate -= 1;
                    } else if (direction == 'E') {
                        xCoordinate += 1;
                    }
                }

            }

        //    return x + " " + y + " " + direction;
        }
    }

    public String getCurrentPosition(){
        return xCoordinate + " " + yCoordinate + " " + direction;
    }




}
