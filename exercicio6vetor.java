/*Faça um programa onde o usuário irá popular com números inteiros positivos um vetor com
        10 posições. Após organize o vetor na ordem inversa dos valores digitados e apresente na
        tela.*/
import java.util.Arrays;
import java.util.Scanner;
public class exercicio6vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[10];
        int inverso[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = sc.nextInt();

            while (vetor[i] < 0) {
                System.out.println("Valor inválido. Digite um número positivo:");
                System.out.print("Digite o valor da posição " + (i +1) + " novamente: ");
                vetor[i] = sc.nextInt();
            }
        }
            for (int i = 0; i < vetor.length; i++) {
                inverso[i] = vetor[vetor.length - 1 - i];
            }
            System.out.println("Vetor: " + Arrays.toString(vetor));
            System.out.println("Inverso: " + Arrays.toString(inverso));
            sc.close();
        }
    }

