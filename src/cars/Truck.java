package cars;

public class Truck extends Car {
    private static final double AIR_CONDITION_FUEL_CONSUMPTION = 1.6;
    private static final double FUEL_CON_PER_100KG_WEIGHT = 0.5;
    private double loadWeight;

    public Truck(String brand, int fuelTankSize, double fuelConsumption, boolean isAirCondition, double loadWeight) {
        super(brand, fuelTankSize, fuelConsumption, isAirCondition);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double range() {
        double truckFuelConsumption = getFuelConsumption();
        if (isAirCondition()) {
            truckFuelConsumption += AIR_CONDITION_FUEL_CONSUMPTION;
        }
        double loadFuelConsumption = loadWeight / 100 * FUEL_CON_PER_100KG_WEIGHT;
        truckFuelConsumption += loadFuelConsumption;
        return getFuelTankSize() / truckFuelConsumption *100;
    }

    @Override
    public double totalFuelConsumption() {
        double truckFuelConsumption = getFuelConsumption();
        if (isAirCondition()) {
            truckFuelConsumption += AIR_CONDITION_FUEL_CONSUMPTION;
        }
        double loadFuelConsumption = loadWeight / 100 * FUEL_CON_PER_100KG_WEIGHT;
        truckFuelConsumption += loadFuelConsumption;
        return truckFuelConsumption;
    }
}
