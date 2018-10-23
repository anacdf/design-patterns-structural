package bridge2;

public class ItensSimbolos extends AbstracaoImpressao {
    public ItensSimbolos(ListaImpl lista) {
        super(lista);
    }

    @Override
    public void imprimeItens() {
        System.out.println("Apenas simbolos: ");
        lista.imprimir();
    }
}
