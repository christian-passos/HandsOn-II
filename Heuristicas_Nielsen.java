import java.util.Scanner;

public class Heuristicas_Nielsen {
    public static void main(String[] args) {
        // Declarando variáveis //
        Scanner scanner = new Scanner(System.in);
        char opcao;
        int tentativas = 0;
        boolean acertou = false;
        // Apresentando questão e colhendo a resposta //
        do {
            tentativas++;
            System.out.println("------- HEURÍSTICAS DE NIELSEN -------");
            System.out.println("Qual heurística diz que o sistema deve sempre informar o que está acontecendo?");
            System.out.println("a) Padrões do sistema");
            System.out.println("b) Status do sistema");
            System.out.println("c) Evitar erros");
            System.out.println("d) Design bonito");
            System.out.println("e) Atalhos de uso");
            System.out.print("\nDigite a opção que considera correta: ");
            
            opcao = scanner.next().toLowerCase().charAt(0);
            
            // Verificando a letra escolhida e retornando o resultado para o usuário // 
            switch (opcao) {
                case 'b':
                    System.out.println("Resposta correta!\n");
                    System.out.println("Você acertou na tentativa: \n" + tentativas);
                    acertou = true;
                    break;
                case 'a':
                case 'c':
                case 'd':
                case 'e':
                    System.out.println("Resposta incorreta.\n");
                    break;
                
                default:
                    System.out.println("Opção inválida.\n");
                    break;
            }

            if (!acertou && tentativas == 3) {
                System.out.println("Resposta incorreta nas 3 tentativas\n.");
            }

        } while (!acertou && tentativas < 3);

        scanner.close();
    }
}