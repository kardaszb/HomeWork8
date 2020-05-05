package cars;

public class Truck extends Car {
    private double loadWeight;

    public Truck(String brand, int fuelTankSize, double fuelConsumption, boolean isAirCondition, double loadWeight) {
        super(brand, fuelTankSize, fuelConsumption, isAirCondition);
        this.loadWeight = loadWeight;
    }

    private double fuelConsDependOnWeight() {
        return (FUEL_CON_PER_100KG_WEIGHT * loadWeight) / 100;
    }

    @Override
    public double getFuelConsumption() {
        return super.getFuelConsumption() + fuelConsDependOnWeight() + 0.8;
    }

    @Override
    public double vehicleRange() {
        return super.vehicleRange() + getFuelConsumption();
    }

    @Override
    public String showInfo() {
        return super.showInfo() + " Masa pojazdu: " + loadWeight + " [kg]";
    }
}
