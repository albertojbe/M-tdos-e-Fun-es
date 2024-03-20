import java.util.Scanner;

public class Caixa {
    static double saldo = 1000.00;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        tela();
        opcao = scan.nextInt(); 
        opcoes(opcao, scan);
        scan.close();
    }

    public static void tela() {
        System.out.println("Bem-vindo ao Caixa Eletrônico");
        System.out.println("Seu saldo atual é: R$" + saldo);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Consultar Saldo");
    }

    public static String opcao1(Scanner scan) {
        System.out.printf("Digite o valor do saque: ");
        double valor = scan.nextDouble();
        if (valor == 0) {
            return "Saldo insuficiente.";
        } else {
            saldo -= valor;
            return "Saque de R$" + valor + " Realizado.";
        }
    }
    public static String opcao2(Scanner scan){
        System.out.println("Digite o valor do depósito: ");
        double valor = scan.nextDouble();
        saldo += valor;
        return "Depósito no valor de R$" + valor + " realizado.";
    }
    public static void opcoes(int opcao, Scanner scan){
        if (opcao == 1) {
            System.out.println(opcao1(scan));
        } else if (opcao == 2) {
            System.out.println(opcao2(scan));
        } else if (opcao == 3) {
            System.out.println("Seu saldo atual é: R$" + saldo);
        } else {
            System.out.println("Opção inválida.");
        }

    }
}
