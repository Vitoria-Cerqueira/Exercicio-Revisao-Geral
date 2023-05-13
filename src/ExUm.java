import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//        1. Tem-se um conjunto de dados contendo a altura e o sexo
//        (masculino, feminino) de 10 pessoas. Fazer um algoritmo
//        que calcule e escreva:
//        a. a maior e a menor altura do grupo;
//        b. média de altura dos homens;
//        c. o número de mulheres.
// terminar exercicio
public class ExUm {
    static Scanner teclado = new Scanner(System.in);
    static List <Double> alturaFeminina = new ArrayList<>();
    static List <Double> alturaMasculina = new ArrayList<>();
    static Double maiorValor = Double.MIN_VALUE;
    static Double menorValor = Double.MAX_VALUE;

    public static void main(String[] args) {
        informacoesUsuario();
        verificarAlturaFem();
    }
    static double altura;
    public static void informacoesUsuario (){
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua altura");
            altura = teclado.nextDouble();

            System.out.println("Digite seu sexo \nF- Feminino \n M - Masculino");
            char sexo = teclado.next().charAt(0);

            if (sexo == 'F' || sexo == 'M'){ // validação do sexo
                System.out.println(sexo);
            } else {
                System.out.println("Voce digitou o sexo errado");
                System.exit(0);
            }

            if (sexo == 'F'){
                alturaFeminina.add(altura);
                System.out.println(alturaFeminina);
            }else {
                alturaMasculina.add(altura);
                System.out.println(alturaMasculina);
            }
        }

    }
    public static void verificarAlturaFem (){
        for (int i = 0; i < alturaFeminina.size(); i++) {

            if (alturaFeminina.get(i) > maiorValor){

                maiorValor = alturaFeminina.get(i);
            }

        }

        for (int i = 0; i < alturaFeminina.size(); i++) {

            if (alturaFeminina.get(i) < menorValor){

                menorValor = alturaFeminina.get(i);
            }

        }
        System.out.println("O menor valor é " + menorValor);
        System.out.println("O maior valor é " + maiorValor);
    }

}


