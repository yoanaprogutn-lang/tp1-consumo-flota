import java.util.Scanner;
public class Flota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    final double PRECIO_LITRO = 1250.0;
    int cantidadViajes;
    do {
        System.out.print("ingrese la cantidad de viajes a procesar (mayor a cero): ");
    cantidadViajes = scanner.nextInt();
    } while (cantidadViajes <=0);
    int totalKm = 0;
    double totalLitros = 0;
    double maxConsumo = -1;
    String patenteMaxConsumo = "";
    for (int i = 1; i <= cantidadViajes; i++) {
        System.out.println("\n----------------Datos del Viaje #" + i + "---");
        System.out.print("Ingrese la pantente:  ");
        scanner.nextLine();
        String patente = scanner.nexLine();
    }
    }
}