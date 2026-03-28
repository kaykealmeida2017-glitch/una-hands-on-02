import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma frase com letras, números, espaços e caracteres especiais: ");
        String texto = scanner.nextLine();

        int letras = 0;
        int numeros = 0;
        int espacos = 0;
        int outros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isWhitespace(c)) {
                espacos++;
            } else {
                outros++;
            }
        }

            System.out.println("Letras: " + letras);
            System.out.println("Números: " + numeros);
            System.out.println("Espaços: " + espacos);
            System.out.println("Outros caracteres: " + outros);

        scanner.close();
    }
}
