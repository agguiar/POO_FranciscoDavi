package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecoes {

    public void executarUtilitarios() {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(50);
        numeros.add(20);
        numeros.add(40);
        numeros.add(30);

        System.out.println(
                "Lista original: " + numeros
        );


        Collections.shuffle(numeros);

        System.out.println(
                "Após shuffle: " + numeros
        );


        Collections.reverse(numeros);

        System.out.println(
                "Após reverse: " + numeros
        );


        Integer menor =
                Collections.min(numeros);

        Integer maior =
                Collections.max(numeros);

        System.out.println(
                "Menor valor: " + menor
        );

        System.out.println(
                "Maior valor: " + maior
        );


        List<Integer> listaSincronizada =
                Collections.synchronizedList(numeros);

        System.out.println(
                "Lista sincronizada: "
                + listaSincronizada
        );

    }

}