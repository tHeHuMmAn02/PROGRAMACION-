public class Animal {
// Atributos
    private String apodo; // NO NULO, NO MODIFICABLE
    private int peso;    // KG
    
    public Animal() {
        setApodo("");
        setPeso(0);
        
    }
    
    public Animal (String apodo) {
        setApodo(apodo);
    }
    
    public Animal (int peso) {
        setApodo("");
        setPeso(peso);
    }
    
    public Animal (String apodo, int peso) {
        setApodo("");
        setPeso(peso);
    }
    
    private void setApodo(String apodo) {
        assert apodo!=null: "El apodo no puede ser nulo";
        this.apodo=apodo;
    }
    
    public void setPeso(int peso) {
        assert peso>=0: "El peso debe ser >=0 [peso=%d]".formatted(peso);
        this.peso=peso;
    }
    
    public void comer() {
        peso +=2;
    }
    
    public void comer(int cantidad) {
       peso += cantidad; 
    }
    
    public  String toString() {
        return "%s (%d Kg)"
            .formatted(apodo.equals("") ? "SIN APODO" : apodo, peso);
    }
}