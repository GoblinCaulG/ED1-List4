package numero1;

import java.util.Scanner;

public class ConversorDeNotas {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor para a conversão: ");
        int notas= sc.nextInt();
        int[] resultado= calcularNotas(notas);
        System.out.println("Notas de 50: "+ resultado[0]);
        System.out.println("Notas de 20: "+ resultado[1]);
        System.out.println("Notas de 10: "+ resultado[2]);
    }
    public static int[] calcularNotas(int notas){
        int notas50,notas20;
        notas50= notas/50;
        notas= notas%50;
        notas20= notas/20;
        notas=notas%20;
        notas = notas /10;
        return new int[]{notas50,notas20,notas};
    }


}
