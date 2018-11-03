package bridge2;

import org.omg.CORBA.Object;
import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.List;

public class ListaDesordenada implements ListaImpl {
    private ArrayList<String> lista;
    private int i=0;


    public ListaDesordenada(){
        lista = new ArrayList<>();
    }

    public void adicionar(String s) {
        lista.add(s);
    }

    @Override
    public void imprimir() {
        System.out.println(lista.get(i));
        i=i+1;
        if(i==5)i=0;
    }
}
