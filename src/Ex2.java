import java.util.Scanner;

public class Ex2 {

    //Ler um valor do teclado e imprimir seu antecessor

    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner input= new Scanner(System.in);
        int valorInformado = input.nextInt();

        System.out.println("O seu antecessor e ");
        System.out.println(valorInformado - 1);

    }
}
