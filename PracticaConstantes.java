public class PracticaConstantes {

    // 1️⃣ Variable de clase (static variable)
    static int variableDeClase = 10;

    // 2️⃣ Constante de clase (static final constant)
    static final int CONSTANTE_DE_CLASE = 100;

    // 3️⃣ Variable de instancia
    int variableDeInstancia = 20;

    // 4️⃣ Constante de instancia (final variable)
    final int CONSTANTE_DE_INSTANCIA = 200;

    // Constructor
    public PracticaConstantes() {
        System.out.println("Constructor ejecutado.");
    }

    // 5️⃣ Método para mostrar variables locales y constantes locales
    public void metodoEjemplo(final int parametroConstante, int parametroVariable) {

        // 6️⃣ Variable local
        int variableLocal = 30;

        // 7️⃣ Constante local (usamos 'final')
        final int CONSTANTE_LOCAL = 300;

        // Imprimir valores iniciales
        System.out.println("---- VALORES INICIALES ----");
        System.out.println("Variable de clase: " + variableDeClase);
        System.out.println("Constante de clase: " + CONSTANTE_DE_CLASE);
        System.out.println("Variable de instancia: " + variableDeInstancia);
        System.out.println("Constante de instancia: " + CONSTANTE_DE_INSTANCIA);
        System.out.println("Variable local: " + variableLocal);
        System.out.println("Constante local: " + CONSTANTE_LOCAL);
        System.out.println("Parámetro variable: " + parametroVariable);
        System.out.println("Parámetro constante: " + parametroConstante);

        // Modificamos las variables
        variableDeClase = 50; // ✅ se puede
        variableDeInstancia = 60; // ✅ se puede
        variableLocal = 70; // ✅ se puede
        parametroVariable = 80; // ✅ se puede

        // ❌ Intentos de modificación de constantes (causan error si se descomentan)
        // CONSTANTE_DE_CLASE = 150;        // Error: cannot assign a value to final variable
        // CONSTANTE_DE_INSTANCIA = 250;    // Error: cannot assign a value to final variable
        // CONSTANTE_LOCAL = 350;           // Error: cannot assign a value to final variable
        // parametroConstante = 400;        // Error: cannot assign a value to final parameter

        System.out.println("---- VALORES MODIFICADOS ----");
        System.out.println("Variable de clase: " + variableDeClase);
        System.out.println("Variable de instancia: " + variableDeInstancia);
        System.out.println("Variable local: " + variableLocal);
        System.out.println("Parámetro variable: " + parametroVariable);
    }

    public static void main(String[] args) {
        PracticaConstantes objeto = new PracticaConstantes();
        objeto.metodoEjemplo(999, 111);
    }
}
