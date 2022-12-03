import dz1.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic<Car> pert = new Mechanic<>("Петр", "Петров", "Pirelli");
        Mechanic<Transport> pert1 = new Mechanic<>("Петр1", "Петров1", "Pirelli");
        Mechanic<Truck> pert2 = new Mechanic<>("Петр2", "Петров2", "Pirelli");
        Sponsor lukoil = new Sponsor("Лукойл", 2_000_000);
        Sponsor michelin = new Sponsor("Michelin", 3_000_000);
        Car car = new Car("Lada", "Vesta", 1.6,TypeOfBody.HATCHBACK);
        car.addDriver( new DriverB(" Сумцов Владислав Владимирович", "В", 1.5));
        car.addMechanic(pert);
        car.addSponsor(lukoil,michelin);
//
//        Car bmv = new Car("BMV", "х5", 4.4,TypeOfBody.COUPE);
//        Car kia = new Car("Kia", "K5", 2.0,TypeOfBody.CROSSOVER);
//        Car skoda = new Car("Skoda", "Superb", 1.4,TypeOfBody.MINIVAN);
//
//        Bus ford = new Bus("Ford", "Transit", 2.2,Capacity.EXTRA_LARGE);
//        Bus iveco = new Bus("IVECO", "Crossway", 3.0,Capacity.MEDIUM);
//        Bus gaz = new Bus("Газ", "Next Citiline", 2.8,Capacity.SMALL);
        Bus bus = new Bus("Volkswagen ", "LT", 2.5,Capacity.EXTRA_LARGE);
        bus.addDriver(  new DriverC("Глушков Максим Александрович", "С", 5.5));
        bus.addMechanic(pert1);
        bus.addSponsor(lukoil,michelin);

//        Truck nissan = new Truck("Nissan", "Diesel", 12.9,Weight.N1);
        Truck truck = new Truck("FAW", "CA3310", 11.1,Weight.N2);
        truck.addDriver( new DriverD("Карпов Михайл Владимирович", "D", 7.5));
        truck.addMechanic(pert2);
        truck.addSponsor(lukoil,michelin);
//        Truck hyndai = new Truck("Hyndai", "Gold", 7.9,Weight.N3);
//        Truck man = new Truck("MAN", "10", 6.9,Weight.N3);



       // DriverB driver1 = new DriverB(" Сумцов Владислав Владимирович", "В", 1.5);
       // printInfo(driver1,lada);

//        DriverC driver2 = new DriverC("Глушков Максим Александрович", "С", 5.5);
//        printInfo(driver2,ford);
//
//        DriverD driver3 = new DriverD("Карпов Михайл Владимирович", "D", 7.5);
//        printInfo(driver3,faw);


        List<Transport>transports=List.of(car, truck, bus);

        ServiseStation serviseStation = new ServiseStation();
        serviseStation.addCar(car);
        serviseStation.addTuck(truck);
        serviseStation.service();
        serviseStation.service();


        for (Transport transport:transports){
            printInfo(transport);
        }

    }

    private static void printInfo(Transport transport){
        System.out.println("Информация по автомобилю "+transport.getModel()+" "+transport.getBrand());
        System.out.println("Водители: "+transport.getDrivers());
//        for (Driver<?>driver:transport.getDrivers()){
//            System.out.println(driver.getfIo());
//        }
        System.out.println("Спонсоры: "+transport.getSponsors());
//        for (Sponsor sponsor:transport.getSponsors()){
//            System.out.println(sponsor.getName());
//        }
        System.out.println("Механики: "+transport.getMechanics());
//        for (Mechanic<?>mechanic:transport.getMechanics()){
//            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + "из" + mechanic.getCompany());
//        }
        System.out.println();
    }

//    private static void service(Transport...transport){
//        for (Transport value : transport) {
//            serviceTransport(value);
//        }
//
//    }

//    private static void serviceTransport(Transport transport){
//        try {
//            if (!transport .service()){
//                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
//            }
//        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//    private static void printInfo(Driver<?> driver,Transport transport){
//        System.out.println("Водитель:" + driver.getfIo()+" управляет автомобилем " +transport.getBrand()+" "+
//                " и будет участвовать заезде" );
//        transport.printType();
//    }

}