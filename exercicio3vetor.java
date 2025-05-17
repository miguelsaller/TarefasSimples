/*Faça um algoritmo que realize a união de dois vetores de mesmo tamanho e tipo em um
        terceiro vetor com o dobro do tamanho dos dois primeiros.*/

import java.util.Arrays;
import java.util.Scanner;
public class exercicio3vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] uniao = new int[10];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite um valor para vetor 1: ");
            vetor1[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite um valor para vetor 2: ");
            vetor2[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor1.length; i++) {
            uniao[i] = vetor1[i];
        }
        for (int i = 0; i < vetor2.length; i++) {
            uniao[vetor1.length + i] = vetor2[i];
        }

        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("União dos vetores: " + Arrays.toString(uniao));

        sc.close();
    }
}
