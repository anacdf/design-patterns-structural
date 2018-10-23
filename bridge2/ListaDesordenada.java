package bridge2;

import org.omg.CORBA.Object;
import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.List;

public class ListaDesordenada implements ListaImpl {
    ArrayList<String> lista;
    List<String> listadesordenada;


    public ListaDesordenada(){
        lista = new ArrayList<>();
    }

    public void adicionar(String s) {
        lista.add(s);
    }

    @Override
    public void imprimir() {
        lista.stream().unordered().forEach(s -> System.out.println("item sem ordem: "+s));
    }
}
