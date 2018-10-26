package bridge2;

import java.util.Arrays;
import java.util.List;

public class ItensSimbolos extends AbstracaoImpressao {
    private List<String> simbolos;

    public ItensSimbolos(ListaImpl lista) {
        super(lista);
    }

    @Override
    public void imprimeItens() {
       simbolos = Arrays.asList("#","#","#","#","#");

        System.out.println("simbolos: ");
            for(int i=0; i<simbolos.size(); i++){
                System.out.print(simbolos.get(i).toString() + " ");
                lista.imprimir();
            }
    }
}
