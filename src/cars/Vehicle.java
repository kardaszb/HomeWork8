package cars;

public class Vehicle {
    private String brand;
    private int fuelTankSize;
    private double fuelConsumption;

    public Vehicle(String brand, int fuelTankSize, double fuelConsumption) {
        this.brand = brand;
        this.fuelTankSize = fuelTankSize;
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(int fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double range() {
        return fuelTankSize / totalFuelConsumption() * 100;
    }

    public double totalFuelConsumption(){
        return fuelConsumption;
    }
}
