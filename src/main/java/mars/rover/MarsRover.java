package mars.rover;

public class MarsRover {

    private Coordinate coordinate ;
    private Direction d = Direction.NORTH;
    private final int maxHeight;
    private final int maxlength;

    public MarsRover(int maxHeight, int maxlength) {
        this.maxHeight = maxHeight;
        this.maxlength = maxlength;
    }

    public void move(int x, int y, char dir, String instructions) throws ExceedingPlateauBoundaryException {
        coordinate = new Coordinate(x,y);

        d = d.setCurrentDirection(dir);

        if (!instructions.isEmpty()) {
            for (char instruction : instructions.toCharArray()) {

                if (instruction == 'L') {
                    d = d.rotateLeft();

                } else if (instruction == 'R') {
                    d = d.rotateRight();
                }
                else if (instruction == 'M') {
                    startMoving();

                }
                System.out.println(coordinate.x() + " "+ coordinate.y());
            }

        }
    }

    private void startMoving() throws ExceedingPlateauBoundaryException {
        if(coordinate.x()>maxlength || coordinate.x()<0  || coordinate.y() > maxHeight || coordinate.y() <0){
            throw new ExceedingPlateauBoundaryException("Cannot move out of the plateau boundary");
        }
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

    public String getCurrentPosition(){
        return coordinate.x()  + " " + coordinate.y() + " " + d.value();
    }




}
