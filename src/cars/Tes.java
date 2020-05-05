package cars;

public class Tes {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Car("Toyota Avensis", 55, 5.5, false);
        cars[1] = new Truck("Iveco Stralis", 55, 5.5, false, 100);

        for (Car car : cars) {
            System.out.println(car.getBrand() + " spalanie: " + car.range());
        }

        for (Car car : cars) {
            car.setAirCondition(true);
            System.out.println(car.getBrand() + " spalanie: " + car.range());
        }
    }
}
