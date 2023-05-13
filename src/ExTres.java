//Crie um programa para verificar se o inteiro fornecido é um
//        múltiplo de 5 e 7.


import java.util.Scanner;

public class ExTres {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos numeros deseja inserir ");
        int qtaNumero = teclado.nextInt();

        for (int i = 0; i < qtaNumero; i++) {
            System.out.println("Digite um numero inteiro");
            int numero = teclado.nextInt();

            if (numero % 5 == 0 && numero % 7 == 0){
                System.out.println("É um multiplo de 5 e 7");
            }
            else if (numero % 5 == 0) {
                System.out.println("É multiplo só de 5 ");
            }
            else if (numero % 7 == 0) {
                System.out.println("É multiplo só de 7 ");
            }
            else {
                System.out.println("Não é multiplo de 7, e não é multiplo de 5");
            }
        }

    }
}
