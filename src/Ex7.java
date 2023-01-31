import java.util.Scanner;

public class Ex7 {
    /*
    uma revendedora de carros usados paga a seus funcionarios vendedores um salario fixo por mes,
     mais uma comissao fixa por carros vendidos e mais 5% sobre o total de vendas efetuadas.
     Escreva um algoritmo que leia o total de carros vendidos o valor total de vendas,
     o valor que ele recebe por cada carro e o salario fixo e calcule o salario do mesmo.
     */

    public static void main(String[] args) {
        System.out.println("Informe a quantidade de carros vendidos: ");
        Scanner quantidade = new Scanner(System.in);
        int totalDeCarrosVendidos = quantidade.nextInt();

        System.out.println("Informe o valor total de vendas: ");
        Scanner numero = new Scanner(System.in);
        int valorTotalDeVendas = numero.nextInt();
    }
}
