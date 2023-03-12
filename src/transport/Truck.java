package transport;
public class Truck extends Transport implements Serviceable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель на грузовике");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service(Mechanic mechanic) {
        super.service(mechanic);
        checkEngine();
        checkTrailer();
    }
}

