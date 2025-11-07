public class Principal {
    public static void main(String[] args) {
        System.out.println("Ejemplo con && (AND lógico):");
        boolean resultado1 = metodoFalso() && metodoVerdadero();
        System.out.println("Resultado final: " + resultado1);
        System.out.println();

        System.out.println("Ejemplo con || (OR lógico):");
        boolean resultado2 = metodoVerdadero() || metodoFalso();
        System.out.println("Resultado final: " + resultado2);
    }

    // Método que devuelve true y muestra un mensaje
    public static boolean metodoVerdadero() {
        System.out.println("Se ejecuta metodoVerdadero()");
        return true;
    }

    // Método que devuelve false y muestra un mensaje
    public static boolean metodoFalso() {
        System.out.println("Se ejecuta metodoFalso()");
        return false;
    }

}