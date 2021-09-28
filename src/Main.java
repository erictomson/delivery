import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // No programa principal o usuário deve receber um menu podendo escolher entre as
        // opções [1] sanduíches, [2] massas, [3] bolos.

        do {
            // Menu Principal
            System.out.println("Menu Delivery");
            System.out.println("[1] Sanduiches");
            System.out.println("[2] Massas");
            System.out.println("[3] Bolos");
            System.out.println("[4] SAIR");
            System.out.println("Digite a sua opção: ");
            // Configurar Scanner leitura da opção escolhida
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            // System.out.println("Opção digitada: " + opcao);
            switch (opcao) {
                case 1:
                    System.out.println("Opção escolha: sanduiche");
                    break;
                case 2:
                    System.out.println("Opção escolha: massas");
                    break;
                case 3:
                    System.out.println("Opção escolha: bolos");
                    break;
                case 4:
                    System.out.println("Opção escolha: sair do sistema...");
                    // Executa a saída do sistema com código 0
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(true);
    }
}
