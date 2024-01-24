package figuras;

import java.util.Scanner;

public class Trapeze {
    public static void calculateTrapeze() {
        Scanner scanner = new Scanner(System.in);
        double base_major, base_minor, height, area;

        System.out.println("Ingresa la base mayor del Trapecio:");
        base_major = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingresa la base menor del Trapecio");
        base_minor = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingresa la altura del trapecio");
        height = Double.parseDouble(scanner.nextLine());
        area = (base_major + base_minor) * height / 2;
        System.out.println("El área del trapecio es: " + area);
    }
}
