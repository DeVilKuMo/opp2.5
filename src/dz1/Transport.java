package dz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineCapacity;

    private final List<Driver<?>>drivers = new ArrayList<>();
    private final List<Mechanic<?>>mechanics = new ArrayList<>();
    private final List<Sponsor>sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void addDriver(Driver<?>...drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>...mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));
    }    public void addSponsor(Sponsor...sponsor){
        this.sponsors.addAll(Arrays.asList(sponsor));
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void start();

    public abstract void finish();

    public abstract void printType();

    public abstract boolean service();

    public void infoOfVehicle(){
        System.out.println("Информация о транспортном средстве:");
    }

    @Override
    public String toString() {
        return "Транспортное средство {" +
                "марка ='" + brand + '\'' +
                ", модель ='" + model + '\'' +
                ", объем двигателя=" + engineCapacity +
                '}';
    }


    public abstract void repair();
}
