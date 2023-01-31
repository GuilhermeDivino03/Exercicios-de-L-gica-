import java.util.Scanner;

public class Ex9 {
    //ler um numero e dizer se ele e positivo ou negativo

    public static void main(String[] args) {
        System.out.println("Informe um valor: ");
        Scanner numeroDigitado = new Scanner(System.in);
        double valor = numeroDigitado.nextDouble();

        if(valor < 0) {
            System.out.println("Numero negativo");
        }else {
            System.out.println("Numero positivo");
        }
    }
}
