import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExDois {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite a quantidade de funcionario");
        int qtaFuncionario = teclado.nextInt();

        List <Double> salario = new ArrayList<>();

        for (int i = 0; i < qtaFuncionario; i++) {
            System.out.println("Informe o salario do funcionario " + (i + 1));
            salario.add(teclado.nextDouble());
        }
        mediaSalarial(salario);
    }

    public static void mediaSalarial (List<Double> salario){
        int qtaFuncionario =0;

        for (int i = 0; i < salario.size(); i++) {
            qtaFuncionario += salario.get(i);
        }
//        System.out.println("Total da soma dos salarios " + qtaFuncionario);

        double media =0;
        media = (double) qtaFuncionario / salario.size();
        System.out.println("A media salarial é: " + media);
    }
}
