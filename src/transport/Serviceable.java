package transport;

// Для того, чтобы показать что машишу обслуживает механик, а не сама себя
public interface Serviceable {
    void service(Mechanic mechanic);
}
