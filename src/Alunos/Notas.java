
import java.util.Scanner;

public class Notas {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};
        double media = caulcularMedia(notas);
        int maiormedia = MaioresQueMedia(notas, media);
        double maiorNota = MaiorNota(notas);
        System.out.println("A media foi: "+ media);
        System.out.println("Notas maiores que a media foram: "+ maiormedia);
        System.out.println("A maior nota entre todas foi: "+ maiorNota);
    }
    public static double caulcularMedia(double[] notas){
        double soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return soma / notas.length;
    }
    public static int MaioresQueMedia(double[] notas, double media) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= media) {
                contador++;
            }

        }
        return contador;
    }
    public static double MaiorNota(double[] notas){
        double maior = notas[0];
        for(int i = 1; i < notas.length; i++){
            if(notas[i] > maior){
                maior = notas[i];
            }
        }
        return maior;
    }


}
