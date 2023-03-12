package transport;

public class ServiceStation {
    public void check(Serviceable serviceable) {
        Mechanic mechanic = new Mechanic("Сергей");
        serviceable.service(mechanic);
    }

}
