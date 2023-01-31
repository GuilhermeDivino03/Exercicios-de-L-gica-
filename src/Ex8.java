import java.util.Scanner;

public class Ex8 {
    // ler um valor e informar se é maior ou menor que dez

    public static void main(String[] args) {
        System.out.println("Informe um valor: ");
        Scanner numeroDigitado = new Scanner(System.in);
        int valor = numeroDigitado.nextInt();

            if(valor >= 10) {
                System.out.println("Numero e maior que o digitado");
            }else {
                System.out.println("Numero menor que o digitado");
            }
    }
}
