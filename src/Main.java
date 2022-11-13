import dz1.Bus;
import dz1.Car;
import dz1.Truck;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Vesta", 1.6);
        Car bmv = new Car("BMV", "х5", 4.4);
        Car kia = new Car("Kia", "K5", 2.0);
        Car skoda = new Car("Skoda", "Superb", 1.4);

        Bus ford = new Bus("Ford", "Transit", 2.2);
        Bus iveco = new Bus("IVECO", "Crossway", 3.0);
        Bus gaz = new Bus("Газ", "Next Citiline", 2.8);
        Bus volkswagen = new Bus("Volkswagen ", "LT", 2.5);

        Truck nissan = new Truck("Nissan", "Diesel", 12.9);
        Truck faw = new Truck("FAW", "CA3310", 11.1);
        Truck hyndai = new Truck("Hyndai", "Gold", 7.9);
        Truck man = new Truck("MAN", "10", 6.9);

        System.out.println(lada);
        lada.start();
        System.out.println(ford);
        ford.start();
        System.out.println(nissan);
        nissan.finish();


    }

}