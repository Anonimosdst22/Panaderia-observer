import java.util.ArrayList;
import java.util.List;

public class Panaderia implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void agregarObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void quitarObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificarObservers(String producto) {
        for (Observer o : observers) {
            o.actualizar(producto);
        }
    }

    public void hornear(String producto) {
        System.out.println("\nLa panaderia saco: " + producto);
        notificarObservers(producto);
    }
}