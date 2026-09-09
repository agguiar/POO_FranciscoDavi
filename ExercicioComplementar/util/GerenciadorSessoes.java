package util;

import java.util.Enumeration;
import java.util.Hashtable;

public class GerenciadorSessoes {

    private Hashtable<String, String> sessoes =
            new Hashtable<>();

    public void cadastrarSessoes() {

        sessoes.put(
                "usuario01",
                "Sessão ativa"
        );

        sessoes.put(
                "usuario02",
                "Sessão encerrada"
        );

        sessoes.put(
                "usuario03",
                "Sessão ativa"
        );

    }

    public void exibirSessoes() {

        Enumeration<String> chaves =
                sessoes.keys();

        while (chaves.hasMoreElements()) {

            String chave =
                    chaves.nextElement();

            String valor =
                    sessoes.get(chave);

            System.out.println(
                    chave + " - " + valor
            );

        }

    }

}
