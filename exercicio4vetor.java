/*Faça um algoritmo que apresente na tela as tabuadas de 1 até 10. Para isto, utilize apenas
        dois vetores como elementos de multiplicação.*/
import java.util.Scanner;
public class exercicio4vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] multiplicandos = new int[10];
        int[] multiplicadores = new int[10];

        for (int i = 0; i < 10; i++) {
            multiplicandos[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            multiplicadores[i] = i + 1;
        }
        for (int i = 0; i < multiplicandos.length; i++) {
           int numeroTabuada = multiplicandos[i];
           System.out.println("Tabuada do: " + numeroTabuada);
            for(int j = 0; j < multiplicadores.length; j++) {
                int multiplicador = multiplicadores[j];
                int resultado = numeroTabuada * multiplicador;
                System.out.println(numeroTabuada + " x " + multiplicador + " = " + resultado);
            }
            System.out.println();


        }
        sc.close();
    }
}
