import java.util.Scanner;

public class Ex3 {
    //escreva um algoritmo para informar as dimensoes de um retangulo (base e altura)
    // calcule sua area

    public static void main(String[] args) {
        System.out.println("Digite o tamanho do base: ");
        Scanner valorLado = new Scanner(System.in);
        int base = valorLado.nextInt();

        System.out.println("informe o tamanho da altura: ");
        Scanner valorAltura = new Scanner(System.in);
        int altura = valorAltura.nextInt();

        int area = base * altura;

        System.out.println("A area do retangulo e igual a " + area);
    }
}
