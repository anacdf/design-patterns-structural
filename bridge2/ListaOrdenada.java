package bridge2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListaOrdenada implements ListaImpl {
        private LinkedList<String> lista;


    public ListaOrdenada(){
        lista = new LinkedList();
    }

    @Override
    public void adicionar(String s) {
        lista.add(s);
    }

    @Override
    public void imprimir() {
        lista.stream().sorted().forEachOrdered(s -> System.out.println("item ordenado: "+s));
    }
}
