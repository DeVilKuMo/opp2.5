package dz1;

public class Truck extends Transport implements Competing {

    private Weight weight;

    public Truck(String brand, String model, double engineCapacity,Weight weight) {
        super(brand, model, engineCapacity);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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
    public void printType() {
        if (weight==null){
            System.out.println("Данных по авто недостаточно ");
        }else {
            String from = weight.getFrom() == null ? " " : " от " + weight.getFrom()+" ";
            String to = weight.getFrom() == null ? " " : " до " + weight.getTo();
            System.out.println(" Тип грузоподьёмность авто:"+from+to);
        }

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
