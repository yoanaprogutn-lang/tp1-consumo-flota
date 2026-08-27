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
        String patente = scanner.nextLine();

        System.out.print("Ingrese kilometraje inicial;  ");
        int kmInicial = scanner.nextLine();

        System.out.print("Ingrese Kilometraje final:  ");
        int kmFinal = scanner.nextInt();

        System.out.print("Ingrese litros cargados:  ");
        double litros = scanner.nextDouble();

        int kmRecorridos = kmFinal - kmInicial;
        double consumo100km = (litros / kmRecorridos) * 100;

        totalKm += kmRecorridos;
        totalLitros += litros;

             if (consumo100km > maxConsumo) {
                 maxConsumo = consumo100km;
                 patenteMaxConsumo = patente;
             }
      }

        double costoTotal = totalLitros * PRECIO_LITRO;
        double  promedioConsumoFlota = (totalLitros / totalKm) + 100;

        System.out.println("\n =====================================");
        System.out.println("      INFORME CONSOLIDADO DE FLOTA      ");
        System.out.println("\n =====================================");
        System.out.printf("    Total de viajes procesados  :  %10d%n", cantidadViajes);
        System.out.printf("    Total kilometros recorridos :  %10d km%n", totalKm);
        System.out.printf("    Total de litros consumidos  :  %10.2f L%n", totalLitros );
        System.out.printf("    Costo total de combustible  :  $%9.2fd%n", costoTotal);
        System.out.printf("    Consumo promedio Flota      :   %10.2f L/100km%n", promedioConsumoFlota);
        System.out.println("    -------------------------------------");
        System.out.printf("    Camion de mayor consumo     : %s (%.2f L/100km)%n", patenteMaxConsumo, maxConsumo);
        System.out.println("\n =====================================n");

        scanner.close();
    }
}
