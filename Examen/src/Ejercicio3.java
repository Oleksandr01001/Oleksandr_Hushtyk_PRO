import java.util.Scanner;
public class Ejercicio3 {
    static Scanner lectorTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el tipo de café que quiere (\"espresso\",\n" +
                "\"latte\", \"capuchino\"):");
        String tipoCafe = lectorTeclado.next();

        System.out.println("Introduce la cantidad de azucar (en cucharillas):");
        int azucar = lectorTeclado.nextInt();

        System.out.println("Introduce el tamaño que quiere (pequeño, mediano, grande):");
        String tamano = lectorTeclado.next();

        System.out.printf("Preparando un %s de tamaño %s con %d cucharaditas de azucar...",tipoCafe,tamano,azucar);
    }
}