package car;

public class Truck extends Car{

    private boolean empty;

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Truck(int wheels, int weight, int maxSpeed, boolean empty) {
        super(wheels, weight, maxSpeed);
        this.empty = empty;
    }

    @Override
    public void speed(int weight, int maxSpeed) {
        if(weight > 5000 && weight < 6000) {
            this.setMaxSpeed(maxSpeed - 10);
        } else if (weight > 6001 && weight < 9000) {
            this.setMaxSpeed(maxSpeed - 15);
        } else if (weight > 9001) {
            this.setMaxSpeed(maxSpeed - 25);
        }
    }
}
