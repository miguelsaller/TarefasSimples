import java.util.Scanner;
public class Horas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horas;

        while (true) {

            System.out.println("Informe o valor de horas:");
            horas = sc.nextInt();

            if (horas <= 0) {

                System.out.println("Valor Inválido, tente novamente.");
                continue;
            }

            break;
        }

        System.out.println("Serão " + horas * 60 + " minutos.");

        sc.close();
    }
}