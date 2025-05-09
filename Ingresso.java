import java.util.Scanner;
public class Ingresso {
        public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int inteiras;
        int meias;

        while (true) {

        System.out.println("Informe a quantidade de inteiras vendidas:");
        inteiras = sc.nextInt();

        System.out.println("Informe a quantidade de meias vendidas:");
        meias = sc.nextInt();

        if (inteiras < 0 && meias < 0) {

            System.out.println("Valor Inválido, tente novamente mais tarde.");
            continue;
        }

        break;
    }

        System.out.println("Foram vendidas " + inteiras + " inteira(s) e " + meias + " meia(s). Com um total de " + (inteiras + meias) + " ingressos.");
        System.out.println("O lucro total foi de " + (inteiras * 77.5 + meias * 38.75) + " reais.");

    sc.close();
}
}