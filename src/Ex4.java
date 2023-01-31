import java.util.Scanner;

public class Ex4 {
    /*
    escreva um algoritmo que escreva a idade de uma pessoa em anos meses e dias e escreva a idade da pessoa
    expressa em dias. (considerar anos de 365 dias e meses 30 dias).
     */

    public static void main(String[] args) {
        int meses = 30;
        int ano = 365;
        int idade = 0;
        int idadeEmDias = 0;

        System.out.println("Em qual ano voce nasceu: ");
        Scanner input = new Scanner(System.in);
        int anoDeNascimento = input.nextInt();

        System.out.println("Qual o ano atual: ");
        Scanner entradaAno = new Scanner(System.in);
        int anoAtual = entradaAno.nextInt();

        idade = anoAtual- anoDeNascimento;
        System.out.println(idade+" anos");

        idadeEmDias = idade * ano;
        System.out.println("Sua idade em dias e "+ idadeEmDias);
    }
}
