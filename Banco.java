import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        String tipoConta;
        double saldo = 0;
        double valorTransferido = 0;

        System.out.println("Antes de começarmos favor informar seu nome: ");
        nome = sc.nextLine();
        System.out.println("Agora seu tipo de conta: ");
        tipoConta = sc.nextLine();
        System.out.println("Agora seu saldo atual na conta: ");
        saldo = sc.nextDouble();
        sc.nextLine();


        while (true) {

            System.out.println("************************");
            System.out.println("* 1 -Consultar saldo.   *");
            System.out.println("* 2- Receber valores.   *");
            System.out.println("* 3- Transferir valores.*");
            System.out.println("* 4- Sair.              *");
            System.out.println("************************");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Saldo atualizado: R$" + saldo + " .");
                    break;

                case 2:
                    System.out.println("Informe o valor do recebido: ");
                    valorTransferido = sc.nextDouble();
                    if (valorTransferido <= 0) {
                        System.out.println("Valor Inválido, tente novamente.");
                    } else {
                        saldo += valorTransferido;
                        System.out.println("Saldo atualizado: R$" + saldo + " .");
                        System.out.println("Valor Recebido: R$" + valorTransferido + " .");
                    }
                    break;

                case 3:
                    System.out.println("Informe o valor a transferir: ");
                    valorTransferido = sc.nextDouble();
                    sc.nextLine();

                    if (valorTransferido > saldo) {
                        System.out.println("Você não tem saldo suficiente para transferir. Tente novamente.");
                    } else {
                        saldo -= valorTransferido;

                        System.out.println("Saldo atualizado: R$" + saldo + " .");
                        System.out.println("Valor Recebido: R$" + valorTransferido + " .");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Opção Inválida! Tente novamente.");
            }
            System.out.println("************************************");
            System.out.println("* Nome: " + nome + "               *");
            System.out.println("* Tipo de Conta: " + tipoConta + " *");
            System.out.println("* Saldo: " + saldo +    "          *");
            System.out.println("************************************");
        }

    }
}
