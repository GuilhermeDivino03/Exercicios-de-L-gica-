public class Ex5 {
    /*
    escreva um algoritmo para ler o numero maximo de eleitores de um municipio,
    o numero de votos brancos, nulos e validos, calcule e escreva o percentual que cada
    um representa em relacao ao total de eleitores.
     */

    public static void main(String[] args) {
        double totalDeEleitores = 168000;
        double votosValidos = 60000;
        double votosBrancos = 30000;
        double votosNulos = 10000;

        double porcentagemDeVotosValidos = (votosValidos / totalDeEleitores) * 100;
        double porcentagemDeVotosBrancos = (votosBrancos / totalDeEleitores) * 100;
        double porcentagemDeVotosNulos = (votosNulos / totalDeEleitores) * 100;

        System.out.printf("%,.2f %n", porcentagemDeVotosValidos);
        System.out.printf("%,.2f %n", porcentagemDeVotosBrancos);
        System.out.printf("%,.2f", porcentagemDeVotosNulos);
//        System.out.println(porcentagemDeVotosBrancos + " % de votos brancos");
//        System.out.println(porcentagemDeVotosNulos + " % de votos nulos");
    }
}
