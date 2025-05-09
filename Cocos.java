import java.util.Scanner;

public class Cocos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor;
        int cocos;

        while (true) {

            System.out.println("Informe o valor da unidade do coco em reais:");
            valor = sc.nextDouble();

            System.out.println("Informe a quantidade de cocos vendidos:");
            cocos = sc.nextInt();
            if (cocos > 0 && valor > 0) {
                break;
            } else {
                System.out.println("Valor Inválido, tente novamente.");
            }

        }
        double valorFinal = valor * cocos;
        System.out.printf("O valor final será de %.2f reais.\n", valorFinal);
        sc.close();
    }
}

