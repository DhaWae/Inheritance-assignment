public abstract class MotorVehicle extends Vehicle {
    private int engineHP;
    private int numSeats;
    private String fuelType;
    private double fuelConsumption;
    private int year;


    MotorVehicle(int numWheels, int weight, String brand, int gears, int engineHP, int numSeats, double fuelConsumption, int year, String fuelType) {
        super(numWheels, weight, brand, gears);
        this.engineHP = engineHP;
        this.numSeats = numSeats;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.year = year;
    }

    @Override
    public String topSpeed() {
        return "This uses a secret formula using many variables, but its a secret! :p";
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getEngineHP() {
        return engineHP;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getYear() {
        return year;
    }
}
