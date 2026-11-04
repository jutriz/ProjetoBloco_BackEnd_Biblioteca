
import java.util.Scanner;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int emprestimosAtivos;
        boolean exemplarDisponivel;
        boolean exemplarConservado;
        String continuar = "s";

        System.out.println("=== SISTEMA DE BIBLIOTECA ===");

        while (continuar.equalsIgnoreCase("s")) {

            System.out.print("\nQuantidade de emprestimos ativos: ");
            emprestimosAtivos = scanner.nextInt();

            System.out.print("O exemplar esta disponivel? (true/false): ");
            exemplarDisponivel = scanner.nextBoolean();

            System.out.print("O exemplar esta em boas condicoes? (true/false): ");
            exemplarConservado = scanner.nextBoolean();

            if (emprestimosAtivos < 3
                    && exemplarDisponivel
                    && exemplarConservado) {

                System.out.println("Emprestimo autorizado!");

            } else {
                System.out.println("Emprestimo nao autorizado.");

                if (emprestimosAtivos >= 3) {
                    System.out.println("Limite de emprestimos atingido.");
                }

                if (!exemplarDisponivel) {
                    System.out.println("Exemplar indisponivel.");
                }

                if (!exemplarConservado) {
                    System.out.println("Exemplar em condicoes inadequadas.");
                }
            }

            System.out.print("\nDeseja verificar outro emprestimo? (s/n): ");
            continuar = scanner.next();
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}
