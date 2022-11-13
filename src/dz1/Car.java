package dz1;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void start() {
        System.out.println("начать движение");
    }

    @Override
    public void finish() {
        System.out.println("закончить движение");
    }

    @Override
    public void pitStop() {
        System.out.println(" Заехать в боксы ");
        System.out.println(" Заправить машину и сменить резинку ");
    }

    @Override
    public void maxSpeed() {
        System.out.println(" Максимальная скорость у машины");
    }

    @Override
    public void bestTime() {
        System.out.println( " Лучшая скорость круга у машины");
    }
}