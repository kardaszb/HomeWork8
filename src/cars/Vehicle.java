package cars;

public class Vehicle {
    protected static double CAR_AIR_CONDITION_FUEL_CONSUMPTION = 0.8;
    protected static double TRUCK_AIR_CONDITION_FUEL_CONSUMPTION = 1.6;
    protected static double FUEL_CON_PER_100KG_WEIGHT = 0.5;
    private String brand;
    protected int fuelTankSize;
    private double fuelConsumption;

    public Vehicle(String brand, int fuelTankSize, double fuelConsumption) {
        this.brand = brand;
        this.fuelTankSize = fuelTankSize;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }


    public String showInfo() {
        return "Marka='" + brand + '\'' +
                ", pojemność baku=" + fuelTankSize + " [litrow] " +
                ", srednie spalanie [l/100km]=" + fuelConsumption;
    }

}
