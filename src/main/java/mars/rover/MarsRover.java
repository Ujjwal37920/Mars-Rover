package mars.rover;

public class MarsRover {

    private Coordinate coordinate ;
    private Direction d = Direction.NORTH;
    private final int maxHeight;
    private final int maxLength;

    public MarsRover(int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
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

                    if(coordinate.xCoordinate()>=maxLength || coordinate.xCoordinate()<0  || coordinate.yCoordinate() >= maxHeight || coordinate.yCoordinate() <0){
                        throw new ExceedingPlateauBoundaryException("Cannot move out of the plateau boundary");
                    }
                    else {
                        startMoving();
                    }

                }
                System.out.println(coordinate.xCoordinate() + " "+ coordinate.yCoordinate());
            }

        }
    }

    private void startMoving() throws ExceedingPlateauBoundaryException {


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
        return coordinate.xCoordinate()  + " " + coordinate.yCoordinate() + " " + d.value();
    }




}
