//Crie um programa para exibir o inteiro fornecido pelo
//        usuário na ordem inversa.

import java.util.Scanner;

public class ExQuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos numeros deseja inserir ");
        int qtaNumero = teclado.nextInt();

        for (int i = 0; i < qtaNumero; i++) {
            System.out.println("Digite um numero inteiro: ");
            int numeroUsuario = teclado.nextInt();

            String verificarNumero = String.valueOf(numeroUsuario);
            StringBuilder inverso = new StringBuilder(verificarNumero);
            inverso.reverse();

            int numeroInvertido = Integer.parseInt(inverso.toString());
            System.out.println("O numero invertido ficou: " + numeroInvertido);
        }
    }
}
