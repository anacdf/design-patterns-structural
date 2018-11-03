package bridge2;

import java.util.Arrays;
import java.util.List;

public class ItensCaracteres extends AbstracaoImpressao {
    private List<String> letras;

    public ItensCaracteres(ListaImpl lista) {
        super(lista);
    }

    @Override
    public void imprimeItens() {
        letras = Arrays.asList("a","b","c","d","e");

        System.out.println("letras: ");
        for(int j=0; j<letras.size(); j++) {
                   System.out.print(letras.get(j).toString() + " ");
                   lista.imprimir();
               }
        }
}
