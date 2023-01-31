import java.util.Scanner;

public class Ex1_fatorial {
        public static void main(String[] args) {
            System.out.println("Digite o valor a ser calculado");
            Scanner valor = new Scanner(System.in);
            int valorInicial = valor.nextInt();
            int valorMultiplicado = 1;


            for (int i = 1; i <= valorInicial; i++) {
                valorMultiplicado = valorMultiplicado * i;
            }

            System.out.println(valorMultiplicado);
        }
    }

