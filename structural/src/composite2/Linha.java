package composite2;

import java.util.ArrayList;
import java.util.List;

public class Linha implements CelulaImp{
    private List<CelulaImp> celulas;

    public Linha() {
        this.celulas = new ArrayList<>();
    }

    public void adicionar(CelulaImp c) {
        celulas.add(c);
    }

    public void imprimir() {
        celulas.forEach(CelulaImp::imprimir);
    }
}
