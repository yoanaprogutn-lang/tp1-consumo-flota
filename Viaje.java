import java.util.Scanner;
public class Viaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PRECIO_LITRO = 1250.0;
        final double CAPACIDAD_TAQUE = 400.0;
        String continuarPrograma;
        int cantidadViajes;

        do {
            System.out.print("ingrese la cantidad de viajes a procesar (mayor a cero): ");
            cantidadViajes = scanner.nextInt();

        } while (cantidadViajes <= 0);
        int totalKm = 0;
        double totalLitros = 0;
        double maxConsumo = -1;
        String patenteMaxConsumo = "";
        for (int i = 1; i <= cantidadViajes; i++) {
            System.out.println("\n---Datos del Viaje #" + i + "---");
            System.out.print("Ingrese la pantente:  ");
            scanner.nextLine();
            String patente = scanner.nextLine();

            System.out.print("Ingrese kilometraje inicial;  ");
            int kmInicial = scanner.nextInt();

            System.out.print("Ingrese Kilometraje final:  ");
            int kmFinal = scanner.nextInt();

            System.out.print("Ingrese litros cargados:  ");
            double litros = scanner.nextDouble();

            double kmRecorridos = kmFinal - kmInicial;
            double consumo100km = (litros / kmRecorridos) * 100;
            double rendimiento = kmRecorridos / litros;
            double costoTotal = litros * PRECIO_LITRO;
            double costoPorKM = costoTotal / kmRecorridos;
            double porcentajeTanque = (litros / CAPACIDAD_TAQUE) * 100;



                /*        if (consumo100km > maxConsumo) {
                 maxConsumo = consumo100km;
                 patenteMaxConsumo = patente;
                }

                }

                double costoTotal = totalLitros * PRECIO_LITRO;
                 double  promedioConsumoFlota = (totalLitros / totalKm) + 100;*/

            System.out.println("\n =====================================");
            System.out.println("      INFORME CONSOLIDADO          ");
            System.out.println("\n =====================================");
            System.out.printf("     CAMION PATENTE :  %s%n", patente);
            System.out.printf("    Total kilometros recorridos :  %,10.2f km%n", kmRecorridos);
            System.out.printf("    Total de litros consumidos  :  %,10.2f L%n", consumo100km);
            System.out.printf("    Costo total de combustible  :  $%9.2fd%n", costoTotal);
            System.out.printf("    Costo por kilometro         :  $ %,9.2f%n", costoPorKM);
            System.out.printf("    Porcentaje de tanque        :  $ %,10.2f %% %n", costoPorKM);

            System.out.println("    -------------------------------------");
                /*System.out.printf("    Camion de mayor consumo     : %s (%.2f L/100km)%n", patenteMaxConsumo, maxConsumo);
                System.out.println("\n =====================================");

                System.out.println("\n¿Desea iniciar otra ejecucion/comparacion? (C para continuar / S para salir): ");
                 continuarPrograma = scanner.nextLine().trim();

                } while (continuarPrograma.equalsIgnoreCase("C"));*/

            System.out.println("\n¡Gracias por usar el sistema de gestión de flota!");
            scanner.close();
        }

    }
}