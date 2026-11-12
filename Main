public class Main {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();

        Cliente ana = new Cliente("Ana");
        Cliente luis = new Cliente("Luis");
        PantallaMenu pantalla = new PantallaMenu();
        Cajero cajero = new Cajero();

        panaderia.agregarObserver(ana);
        panaderia.agregarObserver(luis);
        panaderia.agregarObserver(pantalla);
        panaderia.agregarObserver(cajero);

        panaderia.hornear("Pan de bono");

        System.out.println("\n--- Luis se desuscribe ---");
        panaderia.quitarObserver(luis);

        panaderia.hornear("Croissant");
    }
}