package mars.rover;

public class Coordinate {
    private int xCoordinate;
    private int yCoordinate;

    public Coordinate(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int xCoordinate(){
        return this.xCoordinate;
    }
    public int yCoordinate(){
        return this.yCoordinate;
    }

    public void moveX(boolean bool){
        if(bool){
            this.xCoordinate ++;
        }
        else{
            this.xCoordinate--;
        }
    }
     public void moveY(boolean bool){
         if(bool){
             this.yCoordinate ++;
         }
         else{
             this.yCoordinate--;
         }
     }
}
