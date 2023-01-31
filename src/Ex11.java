import java.util.Scanner;

public class Ex11 {
    // media aluno considerando que para passar precisa de 7, duas notas
    public static void main(String[] args) {

        System.out.println("Nota de matematica: ");
        Scanner notaDigitada = new Scanner(System.in);
        int notaMatematica = notaDigitada.nextInt();

        int media = 0;

        System.out.println("Nota de portugues: ");
        Scanner notaDoisDigitada = new Scanner(System.in);
        int notaPortugues = notaDoisDigitada.nextInt();

        media = (notaPortugues + notaMatematica) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
