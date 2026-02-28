package ConversorSegundos;
import java.util.Scanner;

public class ConverterSegundos {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre com os segundos para a conversão: ");
        int segundos = sc.nextInt();
        int[]  resultado =ConvertendoSeg(segundos);
        System.out.println("Hora(s): "+ resultado[0]);
        System.out.println("Minuto(s): "+ resultado[1]);
        System.out.println("Segundo(s): "+ resultado[2]);


    }
    public static int[] ConvertendoSeg(int segundos){
        int horas,minutos;
        horas=segundos/3600;
        segundos= segundos%3600;
        minutos= segundos/60;
        segundos= segundos%60;
        return new int[]{horas,minutos,segundos};

    }

}
