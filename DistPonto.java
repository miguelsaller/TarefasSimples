import java.util.Scanner;
public class DistPonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pontoX;
        double pontoY;
        double pontoZ;

        System.out.print("Digite a distância em X: ");
        pontoX = sc.nextDouble();

        System.out.print("Digite a distância em Y: ");
        pontoY = sc.nextDouble();

        System.out.print("Digite a distância em Z: ");
        pontoZ = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(pontoX, 2) + Math.pow(pontoY, 2) + Math.pow(pontoZ, 2));

        System.out.printf("A distância entre os pontos será de: %.2f", distancia);
        sc.close();

    }
}
