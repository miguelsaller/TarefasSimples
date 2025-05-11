import java.util.Scanner;
public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        String senhaString;

        System.out.println("Digite sua senha conforme as regras pré-estabelecidas;");
        System.out.println("- AO MENOS 4 DÍGITOS.");
        System.out.println("- NÃO COMEÇAR COM 9.");
        System.out.println("- A SOMA DOS NÚMEROS DEVE SER MÚLTIPLO 7.");
        System.out.println("- NÃO REPETIR EM SEQUÊNCIA. ");
        System.out.println("- DIGITE '0' PARA SAIR.");

        while (true) {
            System.out.print("Digite sua senha: ");
            senha = sc.nextInt();
            senhaString = senha + "";
            boolean validade = true;
            boolean repetido = false;
            int somaSenha = 0;

            if (senha == 0) {
                System.out.println("- Programa finalizado.");
                validade = false;
                break;
            } else if (senha < 0) {
                System.out.println("- Digite números válidos!");
                validade = false;
            } else if (senhaString.length() < 4) {
                validade = false;
                System.out.println("- Senha com menos de 4 caracteres. ");
            } else if (senhaString.charAt(0) == '9') {
                validade = false;
                System.out.println("- Senha começa com 9. ");
            }
            for (int i = 0; i < senhaString.length(); i++) {
                somaSenha += senhaString.charAt(i) - '0';

            }
            if (somaSenha % 7 != 0) {
                System.out.println("- A senha deve ser múltiplo 7.");
                validade = false;
            }
            for (int i = 0; i < senhaString.length() - 1; i++) {
                if (senhaString.charAt(i) == senhaString.charAt(i + 1)) {
                    repetido = true;
                    break;
                }

            }
            if (repetido) {
                System.out.println("- Números não podem ser repetidos sequencialmente.");
                validade = false;
            }


            if (validade) {
                System.out.printf("%d é uma senha válida\n", senha);
            } else if (validade == false) {
                System.out.printf("%d é uma senha inválida\n", senha);
            }
        }

        sc.close();
    }
}


