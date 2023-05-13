//        Crie um programa para exibir todos os inteiros dentro do
//        intervalo 100-150 cuja soma de todos os dígitos é um
//        número par.

import java.util.ArrayList;
import java.util.List;

public class ExCinco {
    public static void main(String[] args) {

        int[] vetorNumerosdeCemCentoECinquenta = new int[51];

        int numeroInicial = 100;

        for (int i = 0; i < 51; i++) {
            vetorNumerosdeCemCentoECinquenta[i] = numeroInicial;
            numeroInicial++;

        }
        String vetorParaReceberOsNumeros[] = new String[vetorNumerosdeCemCentoECinquenta.length];

        for (int i = 0; i < vetorParaReceberOsNumeros.length; i++) {
            vetorParaReceberOsNumeros[i] = String.valueOf(vetorNumerosdeCemCentoECinquenta[i]);

        }

        List<Integer> numerosQueASomaEPar = new ArrayList<>();

        for (int i = 0; i < vetorParaReceberOsNumeros.length; i++) {
            String[] arrayComNumero = vetorParaReceberOsNumeros[i].split("");
            List<Integer> listaNumerosSeparados = new ArrayList<>();

            for (int j = 0; j < arrayComNumero.length; j++) {
                listaNumerosSeparados.add(Integer.parseInt(arrayComNumero[j]));
            }


            int soma=0;

            for (int h = 0; h < listaNumerosSeparados.size(); h++) {

                soma += listaNumerosSeparados.get(h);

            }

            if (soma % 2 == 0){

                numerosQueASomaEPar.add(Integer.valueOf(vetorParaReceberOsNumeros[i]));


            }

        }

        System.out.println(numerosQueASomaEPar);



    }
}
