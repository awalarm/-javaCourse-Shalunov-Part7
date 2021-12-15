package car;

public abstract class Car {
    private int wheels;
    private int weight;
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Car(int wheels, int weight, int maxSpeed){
        this.wheels = wheels;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    };

    protected abstract void speed(int weight, int maxSpeed);
}
