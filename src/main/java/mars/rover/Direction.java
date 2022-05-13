package mars.rover;

public enum Direction {
    NORTH('N','E','W'),
    WEST('W','N','S'),
    EAST('E','S','N'),
    SOUTH('S','W','E');

    private char value;
    private char left;
    private char right;
    Direction(char value, char right, char left) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Direction rotateLeft() {
        for(Direction direction:values()){
            if(direction.value == this.left){
                return direction;
            }
        }
        return null;
    }

    public Direction rotateRight() {
        for(Direction direction:values()){
            if(direction.value == this.right){
                return direction;
            }
        }
        return null;
    }

    public char value(){
        return value;
    }

    public Direction setCurrentDirection(char dir) {
        for(Direction direction:values()){
            if(  dir == direction.value){
                return direction;
            }
        }
        return null;
    }
}
