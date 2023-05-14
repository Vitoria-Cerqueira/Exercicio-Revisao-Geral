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
    static Double maiorValor = 0.0; // essa maior valor
    static Double menorValor = 0.0; // essa é pra pegar menor valor

    public static void main(String[] args) {
        informacoesUsuario();
        verificarAlturaGrupo();
        verificarMediaAlturaMas();
        verificarQtaMulheres();
    }
    static double altura;
    public static void informacoesUsuario (){
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite sua altura");
            altura = teclado.nextDouble();

            System.out.println("Digite seu sexo \nF- Feminino \n M - Masculino");
            char sexo = teclado.next().charAt(0); // pegar o primeiro caracter

            if (sexo == 'F' || sexo == 'M'){ // validação do sexo
                System.out.println(sexo);
            } else {
                System.out.println("Voce digitou o sexo errado");
                System.exit(0);
            }

            if (sexo == 'F'){
                alturaFeminina.add(altura);

            }else {
                alturaMasculina.add(altura);

            }
        }
        System.out.println("Alturas femininas " + alturaFeminina);
        System.out.println("Alturas masculinas " + alturaMasculina);
    }

    public static void verificarAlturaGrupo (){
        List <List<Double>> grupos = new ArrayList<>();
        grupos.add(alturaFeminina);
        grupos.add(alturaMasculina);

        for (List<Double> altura:grupos) {
            for (int i = 0; i < altura.size(); i++) {
                if (altura.get(i) > maiorValor){

                    maiorValor = altura.get(i);
                } else if (menorValor == 0 || altura.get(i) < menorValor) {
                    menorValor = altura.get(i);
                }
            }
        }
        System.out.println("O menor valor é " + menorValor);
        System.out.println("O maior valor é " + maiorValor);

    }
    public static void verificarMediaAlturaMas(){
        double quantidade =0 ;
        for (int i = 0; i < alturaMasculina.size(); i++) {
            quantidade += alturaMasculina.get(i);

        }
        double media =0.0;
        media = quantidade / alturaMasculina.size();
        System.out.printf("A media das alturas masculinas é %.2f" , media);
    }
    public static void verificarQtaMulheres (){
        System.out.println("A quantidade de mulheres é " + alturaFeminina.size());
    }


}


