public class Principal {
    public static void main(String [] args) {
        Animal a1=new Animal();
        Animal a2=new Animal("ANITA");
        Animal a3=new Animal(10);
        Animal a4=new Animal("COQUITA", 20);
        System.out.printf("%s\n%s\n%s\n%s\n", a1, a2, a3, a4);
        
        // Alimentos a los animales
        a1.comer();
        a2.comer();
        a3.comer(10);
        a4.comer(20);
        
        System.out.println("\nAnimales tras comer");
        System.out.printf("%s\n%s\n%s\n%s\n", a1, a2, a3, a4);
    }
}