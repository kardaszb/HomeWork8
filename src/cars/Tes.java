package cars;

import static cars.Car.changeAirCondition;

public class Tes {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota Avensis", 55, 5.5, false);
//        vehicles[1] = new Car("Toyota Yaris", 35, 4.0, false);
        vehicles[1] = new Truck("Iveco Stralis", 55, 5.5, false, 100);
//        vehicles[3] = new Truck("Iveco Stralis", 800, 20, false, 10000);

        for (Vehicle v : vehicles) {
            System.out.println(v.showInfo());
        }

        changeAirCondition(true);

        for (Vehicle v : vehicles) {
            System.out.println(v.showInfo());
        }

    }
}
