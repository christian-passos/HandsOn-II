import java.util.Scanner;

public class Contador_entrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Solicitando dados ao usuário //
        System.out.print("Insira uma palavra ou frase: ");
        String texto = input.nextLine();
        // Declarando variáveis //
        int letras = 0, espaços = 0, numeros = 0, especiais = 0;
        // Criando contadores //
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isSpaceChar(c)) {
                espaços++;
            } else {
                especiais++;
            }
        }
        // Retornando resposta para o usuário //
        System.out.println("\nResultado:");
        System.out.println("Letras: " + letras);
        System.out.println("Números: " + numeros);
        System.out.println("Espaços: " + espaços);
        System.out.println("Especiais: " + especiais);
        
        input.close();
    }
}