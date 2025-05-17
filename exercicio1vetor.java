/*Faça um algoritmo que popule um vetor de 10 posições com números inteiros positivos.
        Posteriormente copie o conteúdo deste primeiro vetor para um segundo vetor. Por fim,
        imprima os valores de ambos os vetores na tela do computador.*/
import java.util.Arrays;
import java.util.Scanner;
public class exercicio1vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetor2 = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = sc.nextInt();
            vetor2[i] = vetor[i];
        }
        System.out.println("Vetor 1: " + Arrays.toString(vetor));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));

        sc.close();
    }
}
