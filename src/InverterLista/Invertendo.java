package InverterLista;

public class Invertendo {
    public static void inverter_lista(int[] vetor) {

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {

            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }
    }

    public static void main(String[] args) {

        int[] v = {10, 20, 30, 40, 50};

        inverter_lista(v);

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
