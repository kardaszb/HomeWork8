package cars;

public class Car extends Vehicle {
    private static final double AIR_CONDITION_FUEL_CONSUMPTION = 0.8;
    private boolean isAirCondition;

    public Car(String brand, int fuelTankSize, double fuelConsumption, boolean isAirCondition) {
        super(brand, fuelTankSize, fuelConsumption);
        this.isAirCondition = isAirCondition;
    }

    public boolean isAirCondition() {
        return isAirCondition;
    }

    public void setAirCondition(boolean airCondition) {
        isAirCondition = airCondition;
    }

    @Override
    public double totalFuelConsumption() {
        return isAirCondition ? getFuelConsumption() + AIR_CONDITION_FUEL_CONSUMPTION : getFuelConsumption();
    }
}