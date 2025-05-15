import java.util.Scanner;
public class PotenciaEletrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tensao;
        double resistencia;

        System.out.print("Digite o valor da tensão elétrica: ");
        tensao = sc.nextDouble();

        System.out.print("Digite o valor da resistência elétrica: ");
        resistencia = sc.nextDouble();

        double potencia = Math.pow(tensao, 2) / resistencia;

        System.out.printf("O valor da potência será: %.2f%n" ,potencia);
        sc.close();


    }
}
