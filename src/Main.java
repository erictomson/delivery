import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // No programa principal o usuário deve receber um menu podendo escolher entre as
        // opções [1] sanduíches, [2] massas, [3] bolos.

        do {
            mostraMenuPrincipal();
        } while(true);
    }

    public static void montarSanduiche() {
        // Criando objeto sanduiche
        Sanduiche sanduiche = new Sanduiche();
        do {
            // Menu para os Sanduiches
            System.out.println("=====================");
            System.out.println("Menu de Sanduiches");
            System.out.println("Escolha os ingredientes do seu lanche");
            System.out.println("[1] Queijo        [5] Presunto");
            System.out.println("[2] Hamburguer    [6] Molho Especial");
            System.out.println("[3] Bacon         [7] Alface");
            System.out.println("[4] Ovo           [8] Tomate");
            System.out.println("[9] Montar Lanche [0] SAIR");
            System.out.println("Opção: ");
            // Leitura da opção do usuário
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            // Tratando a opção
            switch (opcao) {
                case 1:
                    sanduiche.adicionarIngrediente("Queijo");
                    break;
                case 2:
                    sanduiche.adicionarIngrediente("Hamburguer");
                    break;
                case 3:
                    sanduiche.adicionarIngrediente("Bacon");
                    break;
                case 4:
                    sanduiche.adicionarIngrediente("Ovo");
                    break;
                case 5:
                    sanduiche.adicionarIngrediente("Presunto");
                    break;
                case 6:
                    sanduiche.adicionarIngrediente("Molho Especial");
                    break;
                case 7:
                    sanduiche.adicionarIngrediente("Alface");
                    break;
                case 8:
                    sanduiche.adicionarIngrediente("Tomate");
                    break;
                case 9:
                    // mostrarLanche(sanduiche);
                    mostrarLanche(sanduiche);
                    break;
                case 0:
                    System.out.println("Lanche em produção");
                    mostraMenuPrincipal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }

    public static void mostrarLanche(Sanduiche sanduiche) {
        System.out.println("Seu lanche neste momento: ");
        System.out.println(sanduiche.toString());
    }

    public static void mostrarMenuMassas() {}

    public static void mostrarMenuBolos() {}

    private static void mostraMenuPrincipal() {
        // Menu Principal
        System.out.println("Menu Delivery");
        System.out.println("[1] Sanduiches");
        System.out.println("[2] Massas");
        System.out.println("[3] Bolos");
        System.out.println("[0] SAIR");
        System.out.println("Digite a sua opção: ");
        // Configurar Scanner leitura da opção escolhida
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        // System.out.println("Opção digitada: " + opcao);
        switch (opcao) {
            case 1:
                System.out.println("Opção escolha: sanduiche");
                montarSanduiche();
            case 2:
                System.out.println("Opção escolha: massas");
                break;
            case 3:
                System.out.println("Opção escolha: bolos");
                break;
            case 0:
                System.out.println("Opção escolha: sair do sistema...");
                // Executa a saída do sistema com código 0
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
