import java.util.Scanner;

public class Ex6 {
    /*
    escreva um algoritmo para ler o salario mensal atual de um funcionario e o percentual de
    reajuste. calcular e escrever o novo salario
     */

    public static void main(String[] args) {
        int salarioAtual = 1500;

        System.out.println("Informe o valor do reajuste: ");
        Scanner i = new Scanner(System.in);
        float novoReajuste = i.nextFloat();

        float aumento = (novoReajuste * salarioAtual) / 100;
        float novoSalario = aumento + salarioAtual;

        System.out.println(novoSalario);
    }
}
