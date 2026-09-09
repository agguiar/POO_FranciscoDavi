package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.CupomDesconto;

public class GerenciadorCupons {

    private Set<CupomDesconto> conjuntoCupons = new HashSet<>();

    public void testarInsercao() {

        boolean primeiro =
                conjuntoCupons.add(new CupomDesconto("PROMO10", 10));

        boolean segundo =
                conjuntoCupons.add(new CupomDesconto("PROMO10", 20));

        System.out.println("Primeiro cupom: " + primeiro);
        System.out.println("Segundo cupom: " + segundo);

    }

    public void adicionarCupom(CupomDesconto cupom) {
        conjuntoCupons.add(cupom);
    }

    public void limparCuponsZerados() {

        Iterator<CupomDesconto> it = conjuntoCupons.iterator();

        while (it.hasNext()) {

            CupomDesconto cupom = it.next();

            if (cupom.getPorcentagem() == 0) {
                it.remove();
            }

        }

    }

    public void exibirCupons() {

        for (CupomDesconto cupom : conjuntoCupons) {
            System.out.println(cupom);
        }

    }

}