public class Bus extends MotorVehicle{
    private int cargoSize;


    Bus(int numWheels, int weight, String brand, int gears, int engineHP, int numSeats, double fuelConsumption, int year, String fuelType, int cargoSize) {
        super(numWheels, weight, brand, gears, engineHP, numSeats, fuelConsumption, year, fuelType);
        this.cargoSize = cargoSize;
    }

    @Override
    public String topSpeed() {
        return "This uses a secret formula using many variables, but its a secret! :p";
    }

    public String printBusInfo(){
        return "Cargosize: " + cargoSize + "\n" +
                "Number of wheels: " + getNumWheels() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Brand: " + getBrand() + "\n" +
                "Gears: " + getGears() + "\n" +
                "Engine HP: " + getEngineHP() + "\n" +
                "Number of seats: " + getNumSeats() + "\n" +
                "Fuel consumption: " + getFuelConsumption() + "\n" +
                "Fuel type: " + getFuelType() + "\n" +
                "Year: " + getYear() + "\n" +
                "Top speed: " + topSpeed() + "\n";
    }
}
