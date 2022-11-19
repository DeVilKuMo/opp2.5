import dz1.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Vesta", 1.6,TypeOfBody.HATCHBACK);
        Car bmv = new Car("BMV", "х5", 4.4,TypeOfBody.COUPE);
        Car kia = new Car("Kia", "K5", 2.0,TypeOfBody.CROSSOVER);
        Car skoda = new Car("Skoda", "Superb", 1.4,TypeOfBody.MINIVAN);

        Bus ford = new Bus("Ford", "Transit", 2.2,Capacity.EXTRA_LARGE);
        Bus iveco = new Bus("IVECO", "Crossway", 3.0,Capacity.MEDIUM);
        Bus gaz = new Bus("Газ", "Next Citiline", 2.8,Capacity.SMALL);
        Bus volkswagen = new Bus("Volkswagen ", "LT", 2.5,Capacity.EXTRA_LARGE);

        Truck nissan = new Truck("Nissan", "Diesel", 12.9,Weight.N1);
        Truck faw = new Truck("FAW", "CA3310", 11.1,Weight.N2);
        Truck hyndai = new Truck("Hyndai", "Gold", 7.9,Weight.N3);
        Truck man = new Truck("MAN", "10", 6.9,Weight.N3);


        DriverB driver1 = new DriverB(" Сумцов Владислав Владимирович", "В", 1.5);
        printInfo(driver1,lada);

        DriverC driver2 = new DriverC("Глушков Максим Александрович", "С", 5.5);
        printInfo(driver2,ford);

        DriverD driver3 = new DriverD("Карпов Михайл Владимирович", "D", 7.5);
        printInfo(driver3,faw);

    }
    private static void printInfo(Driver<?> driver,Transport transport){
        System.out.println("Водитель:" + driver.getfIo()+" управляет автомобилем " +transport.getBrand()+" "+
                " и будет участвовать заезде" );
        transport.printType();
    }

}