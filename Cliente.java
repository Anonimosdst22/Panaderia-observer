public class Cliente implements Observer {
    private final String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String producto) {
        System.out.println("   Cliente " + nombre + " se entera: hay " + producto + " recien hecho");
    }
}