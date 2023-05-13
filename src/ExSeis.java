//        Crie um programa para exibir a soma de 20 números
//        usando uma matriz.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExSeis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List <Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero inteiro");
            numeros.add(teclado.nextInt());
        }
        int soma =0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        System.out.println(soma);




    }
}
