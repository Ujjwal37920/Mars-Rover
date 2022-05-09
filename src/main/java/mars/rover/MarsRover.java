package mars.rover;

public class MarsRover {

    private Coordinate coordinate ;
    Direction d = Direction.NORTH;

    public void move(int x, int y, char dir, String instructions) {
        coordinate = new Coordinate(x,y);

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
                        coordinate.moveY(true);
                    } else if (d.value() == 'S') {
                        coordinate.moveY(false);
                    } else if (d.value() == 'W') {
                        coordinate.moveX(false);
                    } else if (d.value() == 'E') {
                        coordinate.moveX(true);
                    }

                }
                System.out.println(coordinate.x() + " "+ coordinate.y());
            }

        }
    }

    public String getCurrentPosition(){
        return coordinate.x()  + " " + coordinate.y() + " " + d.value();
    }




}
