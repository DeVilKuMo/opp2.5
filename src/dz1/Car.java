package dz1;

public class Car extends Transport implements Competing {

    private TypeOfBody typeOfBody;

    public Car(String brand, String model, double engineCapacity,TypeOfBody typeOfBody) {
        super(brand, model, engineCapacity);
        this.typeOfBody = typeOfBody;
    }


    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
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
        if (typeOfBody==null){
            System.out.println("Данных по авто недостаточно ");
        }else {
            System.out.println(" Тип кузова авто:"+typeOfBody);
        }

    }

    @Override
    public boolean service() {
        return Math.random()>0.7;
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