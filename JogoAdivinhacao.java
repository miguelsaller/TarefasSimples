import java.util.Random;
import java.util.Scanner;
public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = new Random().nextInt(100);
        int numeroUsuario;
        System.out.println("Tente adivinhar o número! (5 tentativas)");

        for (int i = 0; i < 5; i++) {
            numeroUsuario = sc.nextInt();

            if(numeroUsuario == numero){
                System.out.println("Parabéns! Você acertou em " + (i + 1) + " tentativas!");
                break;
            }
            else {
                System.out.println("Você errou, tente novamente! Restam " + (5 - i - 1) + " tentativas!");
            }

        }
        sc.close();
    }
}
