package dz1;

public  class DriverB extends Driver <Bus>{


    public DriverB(String fIo, String driverLicense, Double experience) {
        super(fIo, driverLicense, experience);
    }


    @Override
    public void startMove(Bus transport) {
        System.out.println("Водитель"+getfIo()+" участвует в заезде.Начал движение на автомобиле "+transport.getBrand()+" " +transport.getModel());
    }

    @Override
    public void stopMove(Bus transport) {
        System.out.println("Водитель" + getfIo() + " остановил автобус " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель" + getfIo() + " заправил автобус " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }
}
