package rover;

public class Rover {

    private final String name;
    private final Servo left;
    private final Servo right;

    public Rover(String name) {
        this.name = name;
        left = new Servo("left");
        right = new Servo("right");
    }

    public String getName() {
        return name;
    }

    public Servo getLeftServo() {
        return left;
    }

    public Servo getRightServo() {
        return right;
    }

    public void steerLeft(int degrees) {
        left.turnTo(degrees);
    }

    public void steerRight(int degrees) {
        right.turnTo(degrees);
    }
}