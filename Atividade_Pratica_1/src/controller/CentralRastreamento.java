package controller;

import interfaces.IRastreavel;

public class CentralRastreamento {

    public static void inspecionarItem(Object item) {

        if (item instanceof IRastreavel) {

            IRastreavel rastreavel = (IRastreavel) item;
            System.out.println(rastreavel.getStatusRastreio());

        } else {

            System.out.println("Item não é passível de rastreamento.");

        }

    }

}