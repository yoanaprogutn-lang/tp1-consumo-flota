import java.util.Scanner;

public class Flota {

    static final int CANTIDAD_CAMIONES = 6;

    public static double calcularConsumo(double km, double litros) {
        return (litros / km) * 100.0;
    }
    public static void cargarDatos(String[] patentes, double[] km, double[] litros, Scanner scanner) {
        System.out.println("=== REGISTRO DE DATOS DE LA FLOTA ===");
        for (int i = 0; i < CANTIDAD_CAMIONES; i++) {
            System.out.println("\nCamión " + (i + 1) + ":");
            System.out.print("Patente: ");
            patentes[i] = scanner.nextLine();
            System.out.print("Kilómetros recorridos: ");
            km[i] = Double.parseDouble(scanner.nextLine());

            System.out.print("Litros consumidos: ");
            litros[i] = Double.parseDouble(scanner.nextLine());
        }
    }

    public static void mostrarInforme(String[] patentes, double[] km, double[] litros) {
        double totalKm = 0.0;
        double totalLitros = 0.0;
        int idxMaxKm = 0;
        int idxMinKm = 0;

        for (int i = 0; i < CANTIDAD_CAMIONES; i++) {
            totalKm += km[i];
            totalLitros += litros[i];

            if (km[i] > km[idxMaxKm]) idxMaxKm = i;
            if (km[i] < km[idxMinKm]) idxMinKm = i;
        }

        double promedioKm = totalKm / CANTIDAD_CAMIONES;
        double consumoPromedioFlota = calcularConsumo(totalKm, totalLitros);

        System.out.println("\n======================INFORME DE LA FLOTA======================");
        System.out.printf("Total kilómetros recorridos....: %10.2f km\n", totalKm);
        System.out.printf("Total litros consumidos........: %10.2f L\n", totalLitros);
        System.out.printf("Promedio de km por camión......: %10.2f km\n", promedioKm);
        System.out.printf("Camión con más kilómetros......: %s (%.2f km)\n", patentes[idxMaxKm], km[idxMaxKm]);
        System.out.printf("Camión con menos kilómetros....: %s (%.2f km)\n", patentes[idxMinKm], km[idxMinKm]);
        System.out.printf("Consumo promedio flota.........: %10.2f L/100km\n", consumoPromedioFlota);
        System.out.println("===============================================================");

        System.out.println("\n--- CLASIFICACIÓN DE CONSUMO ---");
        for (int i = 0; i < CANTIDAD_CAMIONES; i++) {
            double consumo = calcularConsumo(km[i], litros[i]);
            String clasificacion;

            if (consumo < 8.0) {
                clasificacion = "EFICIENTE";
            } else if (consumo <= 12.0) {
                clasificacion = "NORMAL";
            } else {
                clasificacion = "EXCESIVO";
            }

            System.out.printf("Patente: %-10s | Consumo: %6.2f L/100km | Clasificación: %s\n",
                    patentes[i], consumo, clasificacion);
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] patentes = new String[CANTIDAD_CAMIONES];
        double[] kmRecorridos = new double[CANTIDAD_CAMIONES];
        double[] litrosConsumidos = new double[CANTIDAD_CAMIONES];

        cargarDatos(patentes, kmRecorridos, litrosConsumidos, scanner);
        mostrarInforme(patentes, kmRecorridos, litrosConsumidos);

        scanner.close();
    }
}