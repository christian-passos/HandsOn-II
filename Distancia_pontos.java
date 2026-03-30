import java.util.Scanner;

public class Distancia_pontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raioTerra = 6371.01;

        // Solicitando dados para o usuário //
        System.out.print("Qual a latitude da coordenada 1: ");
        double lat1 = input.nextDouble();
        System.out.print("Qual a longitude da coordenada 1: ");
        double lon1 = input.nextDouble();

        System.out.print("Qual a latitude da coordenada 2: ");
        double lat2 = input.nextDouble();
        System.out.print("Qual a longitude da coordenada 2: ");
        double lon2 = input.nextDouble();

        // Realizando a conversão dos valores informados pelo usuário //
        double x1 = Math.toRadians(lat1);
        double y1 = Math.toRadians(lon1);
        double x2 = Math.toRadians(lat2);
        double y2 = Math.toRadians(lon2);

        // Realizando operação final //
        double distancia = raioTerra * Math.acos(
            Math.sin(x1) * Math.sin(x2) + 
            Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
        );

        System.out.println("A distância entre esses pontos é: " + distancia + " km");
        
        input.close();
    }
}