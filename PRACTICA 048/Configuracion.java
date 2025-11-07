public class Configuracion {
    private static Configuracion instancia;
    private String modo;

    // Constructor privado: evita crear objetos desde fuera
    private Configuracion(String modo) {
        this.modo = modo;
    }

    // Método estático para obtener la única instancia
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion("Modo predeterminado");
        }
        return instancia;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public static void main(String[] args) {
        // Configuracion conf = new Configuracion("Modo manual"); // ERROR: el constructor es privado
        Configuracion conf1 = Configuracion.getInstancia();
        Configuracion conf2 = Configuracion.getInstancia();

        conf1.setModo("Modo avanzado");

        System.out.println(conf2.getModo()); // Imprime "Modo avanzado", porque es la misma instancia
    }
}
