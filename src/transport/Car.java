package transport;

public class Car extends Transport implements Serviceable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на автомобиле");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель на автомобиле");
    }

    @Override
    public void service(Mechanic mechanic) {
        super.service(mechanic);
        checkEngine();
    }
}
