/*Faça um programa onde o usuário irá popular com números do tipo double um vetor com 10
posições. Ao final exiba na tela o maior e o menor valor digitado..*/
import java.util.Scanner;
public class exercicio5vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[10];
        double maiorNumero = 0;
        double menorNumero = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = sc.nextDouble();
        }
        maiorNumero = vetor[0];
        menorNumero = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
            }
            else if (vetor[i] < menorNumero) {
                menorNumero = vetor[i];
            }
        }
        System.out.println("Maior valor: " + maiorNumero);
        System.out.println("Menor valor: " + menorNumero);

            sc.close();
    }
}
