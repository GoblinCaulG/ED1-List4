package Senha;
import java.util.Scanner;

public class Senhas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        int tamanhoOk = verificarTamanho(senha);
        int temEspecial = verificarEspecial(senha);

        mostrarResultado(tamanhoOk, temEspecial);

        scanner.close();
    }

    public static int verificarTamanho(String senha) {

        int tamanhoOk = 0;

        if (senha.length() >= 8) {
            tamanhoOk = 1;
        }

        return tamanhoOk;
    }

    public static int verificarEspecial(String senha) {

        int temEspecial = 0;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                temEspecial = 1;
                break;
            }
        }

        return temEspecial;
    }

    public static void mostrarResultado(int tamanhoOk, int temEspecial) {

        if (tamanhoOk == 1 && temEspecial == 1) {
            System.out.println("Válida");
        } else {
            System.out.println("Inválida");

            if (tamanhoOk == 0) {
                System.out.println("- A senha deve possuir pelo menos 8 caracteres.");
            }

            if (temEspecial == 0) {
                System.out.println("- A senha deve conter pelo menos um caractere especial.");
            }
        }
    }
}
