public class Animal {
    private static final int MIN_PESO=10;   // gramos
    private final int maxPeso;        // >=MIN_PESO             <- ACTIVIDAD  
    private String nombre;                  // NO NULO
    private int peso;                       // >=[MIN_PESO, maxPESO]  <- ACTIVIDAD
    
    public Animal(String nombre, int peso, int maxPeso) {
        setNombre(nombre);
        setPeso(peso);
        this.maxPeso=maxPeso;
    }
    
    public void comer() {
        int cantidad=100;
        cantidad += 20;
        
        final String comida="Carne";
        // comida="Pescado";        <- Error: no puedo modificar una constante
        
        setPeso(peso+cantidad);
        
        System.out.printf("El animal ha comido %d gramos de %s y pesa ahora %d gramos\n", comida, cantidad);
    }
    
    public void setNombre(String nombre) {
        assert nombre!=null: "El nombre no puede ser nulo";
        this.nombre=nombre;
    }
    
    public void setPeso(int peso) {
        assert peso>=MIN_PESO: "El peso debe ser >=%d [peso=%d]".formatted(MIN_PESO, peso);
        this.peso=peso;
    }
    public String toString() {
        return "%s (%d gramos)".formatted(nombre, peso);
    }
}