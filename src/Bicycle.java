public class Bicycle extends Vehicle{

    private int frameSize;

    Bicycle(int numWheels, int weight, String brand, int gears, int frameSize) {
        super(numWheels, weight, brand, gears);
        this.frameSize = frameSize;
    }

    @Override
    public String topSpeed() {
        return "This uses a secret formula using many variables, but its a secret! :p";
    }

    public String printBicycleInfo(){
        return "Framesize: " + frameSize + "\n" +
                "Number of wheels: " + getNumWheels() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Brand: " + getBrand() + "\n" +
                "Gears: " + getGears() + "\n" +
                "Top speed: " + topSpeed() + "\n";
    }
}
