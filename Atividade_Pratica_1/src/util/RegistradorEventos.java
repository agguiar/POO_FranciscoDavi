package util;

import java.util.Vector;

public class RegistradorEventos {

    private Vector<String> eventos = new Vector<>();

    public void registrarEvento(String evento) {
        eventos.add(evento);
    }

    public void exibirEventos() {

        for (String evento : eventos) {
            System.out.println(evento);
        }

    }

}