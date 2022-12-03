package dz1;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineCapacity,Capacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
        if (capacity==null){
            System.out.println("Данных по авто недостаточно ");
        }else {

            System.out.println(" Вместимость автобуса: от:"+capacity.getFrom()+" до "+capacity.getFrom());
        }

    }

    @Override
    public boolean service() {
        System.out.println("Автобус "+getBrand()+""+getModel()+" в диагностике не требуется");
        return true;
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
    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починенн!");
    }
}
