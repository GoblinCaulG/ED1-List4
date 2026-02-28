package numerosIguais;
import java.util.Scanner;

public class Numeros {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] numeros = new int[200];
        int quantidade = lerNumeros(numeros);

        int repetido = verificarRepetidos(numeros, quantidade);

        if (repetido == 1) {
            System.out.println("Ha numeros repetidos na lista.");
        } else {
            System.out.println("Todos os elementos sao unicos.");
        }

    }

    public static int lerNumeros(int[] numeros){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Digite os numeros inteiros ou outra tecla para interromper: ");
        while(scanner.hasNextInt() && i < 200){
            numeros[i] = scanner.nextInt();
            i++;
        }
        return i;

    }
    public static int verificarRepetidos(int[] numeros, int quantidade) {

        int repetido = 0;

        for (int a = 0; a < quantidade; a++) {
            for (int j = a + 1; j < quantidade; j++) {
                if (numeros[a] == numeros[j]) {
                    repetido = 1;
                    break;
                }
            }
            if (repetido == 1) break;
        }

        return repetido;
    }

}
