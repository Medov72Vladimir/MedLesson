package Tanks;

public class Tank {
    private int coordinateX;
    private int coordinateY;
    private int direction;
    private int fuel;
    private int k;
    public final String name = "T34";
    private static int number = 0;
    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int coordinateX, int coordinateY) {
        this(coordinateX, coordinateY, 100);
    }

    public Tank(int coordinateX, int coordinateY,int fuel) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.fuel = fuel;
        k = ++number;
    }

    void goForward(int step){
        if (step > fuel) {
            step = fuel;
        }
        if (step < 0 && -step > fuel) {
            step = -fuel;
        }
        if (direction == 0){
            coordinateX = coordinateX + step;
        } else if (direction == 1) {
            coordinateY = coordinateY + step;
        } else if (direction == 2) {
            coordinateX = coordinateX - step;
        } else {
            coordinateY = coordinateY - step;
        }
        fuel -= Math.abs(step);
    }
    void goBackward(int step){
        goForward(-step);
    }
    void turnRight() {
        direction++;
        if (direction == 4) direction = 0;
    }
    void turnLeft() {
        direction--;
        if (direction == -1) direction = 3;
    }
    void printPosition(){
        System.out.printf("The Tank %s-%d is at %d, %d now.", name, k, coordinateX, coordinateY);
        System.out.println();
    }
}
