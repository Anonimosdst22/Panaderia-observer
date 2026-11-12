public interface Subject {
    void agregarObserver(Observer o);
    void quitarObserver(Observer o);
    void notificarObservers(String producto);
}