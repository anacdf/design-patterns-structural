package bridge2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstracaoImpressao {
    protected ListaImpl lista;

    public AbstracaoImpressao(ListaImpl lista) {
        this.lista = lista;
    }
    public abstract void imprimeItens();
}
