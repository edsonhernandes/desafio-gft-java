import java.util.Scanner;

public class CafeDosDevs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o número de desenvolvedores
        System.out.print("Informe o número de devs: ");
        int numeroDevs = scanner.nextInt();

        // Criar array para armazenar o consumo diário de cada dev
        int[] consumoPorDev = new int[numeroDevs];

        // Ler o consumo de cada dev
        System.out.print("Quantas xícaras por dia cada um toma (separado por espaço): ");
        for (int i = 0; i < numeroDevs; i++) {
            consumoPorDev[i] = scanner.nextInt();
        }

        // Calcular total da semana
        int totalSemana = 0;
        for (int i = 0; i < numeroDevs; i++) {
            totalSemana += consumoPorDev[i] * 5; // 5 dias úteis
        }

        System.out.println("Total da semana: " + totalSemana + " xícaras");

        if (totalSemana <= 100) {
            System.out.println("Estoque suficiente");
        } else {
            System.out.println("Estoque insuficiente");
        }

        scanner.close();
    }
}

