import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char resposta;
        int tentativas = 0;
        boolean acertou = false;

        do {
            tentativas++;

            System.out.println("O que significa a sigla IP?");
            System.out.println("(a) Internet Protocol");
            System.out.println("(b) Internal Process");
            System.out.println("(c) Internet Provider");
            System.out.println("(d) Integrated Program");
            System.out.println("(e) Input Process");

            System.out.print("Escolha uma alternativa: ");
            resposta = scanner.next().toLowerCase().charAt(0);

            switch (resposta) {
                case 'a':
                    System.out.println("Resposta correta");
                    System.out.println("Você acertou na tentativa " + tentativas);
                    acertou = true;
                    break;

                case 'b':
                case 'c':
                case 'd':
                case 'e':
                    if (tentativas < 3) {
                        System.out.println("Resposta incorreta, tente novamente.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    tentativas--; // não conta tentativa inválida
                    break;
            }

        } while (!acertou && tentativas < 3);

        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas");
        }

        scanner.close();
    }
}