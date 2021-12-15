import car.Passenger;
import car.Truck;

public class Main {
    public static void main(String[] args) {

        Passenger lada = new Passenger(4, 700, "sedan", 190);
        Truck man = new Truck(10, 5000, 120,true);
        Truck tatra = new Truck(10, 5000, 140,true);


        System.out.println("Масса: " + man.getWeight());
        System.out.println("Свободный: " + man.isEmpty());
        System.out.println("Макс. скорость: " + man.getMaxSpeed());
        System.out.println();
        System.out.println("Масса: " + tatra.getWeight());
        System.out.println("Свободный: " + tatra.isEmpty());
        System.out.println("Макс. скорость: " + tatra.getMaxSpeed());
        System.out.println("-------");

        man.setWeight(7000);
        tatra.setWeight(10000);

        Truck[] trucks = {man, tatra};

        for (Truck truck : trucks) {
            if(truck.getWeight() > 5000){
                man.setEmpty(false);
            }
            truck.speed(truck.getWeight(), truck.getMaxSpeed());
        }


        System.out.println("Масса: " + man.getWeight());
        System.out.println("Свободный: " + man.isEmpty());
        System.out.println("Макс. скорость: " + man.getMaxSpeed());
        System.out.println();
        System.out.println("Масса: " + tatra.getWeight());
        System.out.println("Свободный: " + tatra.isEmpty());
        System.out.println("Макс. скорость: " + tatra.getMaxSpeed());
    }
}
