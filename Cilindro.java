import java.util.Scanner;
public class Cilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio;
        double altura;

        System.out.println("Digite o raio da base do cilindro: ");
        raio = sc.nextDouble();

        System.out.println("Digite o altura do cilindro: ");
        altura = sc.nextDouble();

        double area = 2 * Math.PI * raio * altura;

        System.out.printf("A área lateral do cilindro é : %.3f%n" ,area);
        sc.close();

    }
}
