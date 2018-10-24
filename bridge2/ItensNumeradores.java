package bridge2;

import java.util.Arrays;
import java.util.List;

public class ItensNumeradores extends AbstracaoImpressao {
    private ListaImpl lista;
    private List<Integer> numeros;

    public ItensNumeradores(ListaImpl lista) {
        super(lista);
    }

    @Override
    public void imprimeItens() {
        System.out.println("Apenas numeros: ");
        numeros = Arrays.asList(1,2,3,4,5);

            for(int i=0; i<numeros.size(); i++){
                System.out.print(numeros.get(i).toString() + " ");
                lista.imprimir();
            }
    }
}
