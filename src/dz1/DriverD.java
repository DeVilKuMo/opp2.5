package dz1;

public class DriverD extends Driver<Truck>{
    public DriverD(String fIo, String driverLicense, Double experience) {
        super(fIo, driverLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        System.out.println("Водитель " + getfIo() + " участвует в заезде. Начал движение на грузовике "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stopMove(Truck transport) {
        System.out.println("Водитель " + getfIo() + " приехал на грузовике " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getfIo() + " заправил грузовик " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }
}
