package rover;

public class Servo {

    private final String name;
    private int angle;

    public Servo(String name) {
        this.name = name;
        angle = 90;
    }

    public Servo(String name, int startingAngle) {
        this.name = name;
        turnTo(startingAngle);
    }

    public String getName() {
        return name;
    }

    public int getAngle() {
        return angle;
    }

    public void turnTo(int degrees) {
        if (degrees > 180) {
            angle = 180;
        } else if (degrees < 0) {
            angle = 0;
        } else {
            angle = degrees;
        }
    }

    public boolean isCentered() {
        return angle == 90;
    }

    @Override
    public String toString() {
        return name + " @ " + angle;
    }
}