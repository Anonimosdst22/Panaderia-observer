public class PantallaMenu implements Observer {
    @Override
    public void actualizar(String producto) {
        System.out.println("   Pantalla: se agrego \"" + producto + "\" al menu del dia");
    }
}