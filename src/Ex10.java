import java.util.Scanner;

public class Ex10 {
    //Ler dois valores e escrever se e maior ou menor

    public static void main(String[] args) {
        System.out.println("Informe o primeiro numero: ");
        Scanner PrimeiroNumeroDigitado = new Scanner(System.in);
        int primeiroValor = PrimeiroNumeroDigitado.nextInt();

        System.out.println("Informe o segundo numero: ");
        Scanner SegundoNumeroDigitado = new Scanner(System.in);
        int segundoValor = SegundoNumeroDigitado.nextInt();



        if(primeiroValor >= segundoValor ) {
            System.out.println(primeiroValor + " e maior que " + segundoValor);
        }else {
            System.out.println(segundoValor + " e maior que "+ primeiroValor);
        }
    }
}
