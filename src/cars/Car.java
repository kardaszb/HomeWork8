package cars;

public class Car extends Vehicle {
    protected static boolean isAirCondition;


    public Car(String brand, int fuelTankSize, double fuelConsumption, boolean isAirCondition) {
        super(brand, fuelTankSize, fuelConsumption);
        this.isAirCondition = isAirCondition;
    }

    @Override
    public double getFuelConsumption() {
        if (isAirCondition) {
            return super.getFuelConsumption() + CAR_AIR_CONDITION_FUEL_CONSUMPTION;
        } else {
            return super.getFuelConsumption();
        }
    }

    public double vehicleRange() {
        return ((double) fuelTankSize * 100) / getFuelConsumption();
    }

    public static void changeAirCondition(boolean airCondition) {
        isAirCondition = airCondition;
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                " Air condition On? [" + isAirCondition + "]"
                + ", zasieg na baku=" + (int) vehicleRange() + " [KM]";
    }
}