import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        /*
         * Crie um algoritmo que solicita um número inteiro ao usuário.
         * Em seguida, deve-se verificar se o número digitado é ou não é um número
         * primo.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        boolean prime = true;

        if (num < 2) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime == false) {
            System.out.printf("O numero %d não é primo. ", num);
        } else if (prime) {
            System.out.printf("O numero %d é primo. ", num);
        }

        scanner.close();
    }
}
