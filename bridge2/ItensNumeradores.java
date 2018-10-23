package bridge2;

import java.util.List;

public class ItensNumeradores extends AbstracaoImpressao {

    public ItensNumeradores(ListaImpl lista) {
        super(lista);
    }

    @Override
    public void imprimeItens() {
        System.out.println("Apenas numeros: ");
        lista.imprimir();
    }
}
