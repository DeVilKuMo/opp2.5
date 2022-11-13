package dz1;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineCapacity;

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

    public abstract void start();

    public abstract void finish();

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
}
