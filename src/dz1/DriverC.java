package dz1;

public class DriverC extends Driver<Car>{
    public DriverC(String fIo, String driverLicense, Double experience) {
        super(fIo, driverLicense, experience);
    }

    @Override
    public void startMove(Car transport) {
        System.out.println("Водитель " + getfIo() + " участвует в заезде. Начал движение на автомобиле "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stopMove(Car transport) {
        System.out.println("Водитель " + getfIo() + " остановился на автомобиле " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель " + getfIo() + " заправил автомобиль " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }
}
