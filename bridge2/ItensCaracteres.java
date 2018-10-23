package bridge2;

import java.util.List;

public class ItensCaracteres extends AbstracaoImpressao {

    public ItensCaracteres(ListaImpl lista) {
        super(lista);
    }

    @Override
    public void imprimeItens() {
        System.out.println("Apenas caracteres: ");
        lista.imprimir();
    }
}
