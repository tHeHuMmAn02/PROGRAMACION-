public class Principal {
    public static void main(String[] args) {
        Alumno a1=new Alumno();
        Alumno a2=new Alumno("PEPE");
        Alumno a3=new Alumno("ANA",1991);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}