import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precioBase = 1000000;
        double precioTiquete = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de Ana: ");
        int edad = scanner.nextInt();

        if (edad < 2) {
            System.out.println("Viajar está prohibido para niños menores de 2 años.");
            return;
        } else if (edad >= 2 && edad < 5) {
            precioTiquete = 0;  
        } else if (edad >= 5 && edad < 11) {
            precioTiquete = precioBase * 0.5;  
        } else if (edad >= 11 && edad < 15) {
            precioTiquete = precioBase * 0.75;  
        } else {
            precioTiquete = precioBase;  
        }

        System.out.println("El precio del tiquete para Ana es: $" + precioTiquete);
    }
}
