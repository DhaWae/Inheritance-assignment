import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bicycle pettersBicycle = new Bicycle(2, 63, "Crescent", 10, 24);
        //System.out.println("Petter Bicycle: " + "\n" + pettersBicycle.printBicycleInfo());

        Car pettersCar = new Car(4,1924,"Toyota",6,150,5,2,2009,"E98","R343",true);
        //System.out.println("Petter Car: " + "\n" + pettersCar.printCarInfo());


        Bus[] pettersBusBusiness;
        pettersBusBusiness = new Bus[100];

        for (int i = 0; i < 100; i++) {
            pettersBusBusiness[i] = new Bus(6,4000,"Mercedes",6,340,65,420,2000,"Diesel",2000);
        }
        System.out.println("Printing info about all petters busses in 10 seconds");
        TimeUnit.SECONDS.sleep(10);

        for (Bus bus: pettersBusBusiness) {
            System.out.println(bus.printBusInfo());
        }

        List<Object> objects = new ArrayList<Object>();
        objects.add(new Car(4,1924,"Toyota",6,150,5,2,2009,"E98","R343",true));
        objects.add(new Bus(6,4000,"Mercedes",6,340,65,420,2000,"Diesel",2000));
        objects.add(new Bicycle(2, 63, "Crescent", 10, 24));
        Car car = (Car) objects.get(0);
        System.out.println(car.printCarInfo());


    }
}