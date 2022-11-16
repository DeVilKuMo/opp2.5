import dz1.*;

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

        DriverB driver1 = new DriverB(" Сумцов Владислав Владимирович", "В", 1.5);
        driver1.startMove(ford);
        driver1.refill(gaz);
        driver1.stopMove(volkswagen);

        DriverC driver2 = new DriverC("Глушков Максим Александрович", "С", 5.5);
        driver2.startMove(lada);
        driver2.stopMove(bmv);

        DriverD driver3 = new DriverD("Карпов Михайл Владимирович", "D", 7.5);
        driver3.startMove(faw);
    }

}