public class Principal {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        int c = 2;
        
        int resultado = (a + b) * c - (a/b) % c;
        
        System.out.println("El resultado de la expresion es:" + resultado);
    }
}