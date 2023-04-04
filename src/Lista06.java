import java.util.Scanner;

public class Lista06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio, area;
        
        System.out.print("Digite o valor do raio do círculo: ");
        raio = input.nextDouble();
        
        area = Math.PI * Math.pow(raio, 2);
        
        System.out.printf("A área do círculo é: %.2f", area);
        input.close();
    }
}
