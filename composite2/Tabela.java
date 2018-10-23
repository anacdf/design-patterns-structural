package composite2;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements CelulaImp{
    private List<CelulaImp> linhas;

    public Tabela() {
         this.linhas = new ArrayList<>();
    }

    public void adicionar(CelulaImp l) {
        linhas.add(l);
    }

    @Override
    public void imprimir() {
        linhas.forEach(CelulaImp::imprimir);
    }
}
