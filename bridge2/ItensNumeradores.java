package bridge2;

import java.util.Arrays;
import java.util.List;

public class ItensNumeradores extends AbstracaoImpressao {
    private List<Integer> numeros;

    public ItensNumeradores(ListaImpl lista) {
        super(lista);
    }

    @Override
    public void imprimeItens() {
        numeros = Arrays.asList(1,2,3,4,5);

        System.out.println("numeros: ");
        for(int j=0; j<numeros.size(); j++) {
            System.out.print(numeros.get(j).toString() + " ");
            lista.imprimir();
        }
    }
}
