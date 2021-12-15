package car;

public class Passenger extends Car{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Passenger(int wheels, int weight, String type, int maxSpeed) {
        super(wheels, weight, maxSpeed);
        this.type = type;
    }


    @Override
    protected void speed(int weight, int maxSpeed) {

    }
}
