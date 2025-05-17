/*Faça um algoritmo que popule dois vetores de 5 posições cada um com números inteiros
positivos. O valor da posição i do primeiro vetor deve ser somado ao valor da posição i do
segundo vetor. O resultado deve ser armazenado na posição i de um terceiro vetor. Ao final,
imprima todos os vetores da tela do computador.*/

import java.util.Arrays;
import java.util.Scanner;
public class exercicio2vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] soma = new int[5];

            for (int i = 1; i < vetor1.length; i++) {
                System.out.print("Digite um valor para o vetor 1 : ");
                vetor1[i] = sc.nextInt();

                while (vetor1[i] <= 0) {
                    System.out.println("Valor inválido. Digite um número positivo:");
                    System.out.print("Digite o valor da posição " + i + " novamente: ");
                    vetor1[i] = sc.nextInt();
                }
            }
            for (int i = 1; i < vetor2.length; i++) {
                System.out.print("Digite um valor para o vetor 2 : ");
                vetor2[i] = sc.nextInt();

                while (vetor2[i] <= 0) {
                    System.out.println("Valor inválido. Digite um número positivo:");
                    System.out.print("Digite o valor da posição " + i + " novamente: ");
                    vetor2[i] = sc.nextInt();
                }
            }
            for (int i = 0; i < soma.length; i++) {
                soma[i] = vetor1[i] + vetor2[i];
            }
            System.out.println("Vetor 1: " + Arrays.toString(vetor1));
            System.out.println("Vetor 2: " + Arrays.toString(vetor2));
            System.out.println("Soma: " + Arrays.toString(soma));

            sc.close();

    }
}
