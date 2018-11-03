package composite2;

//https://www.baeldung.com/java-composite-pattern
public class Cliente {
    public static void main(String[] args) {
        CelulaImp celula = new Celula("abc");
        CelulaImp celula1 = new Celula("abcd");
        CelulaImp celula2 = new Celula("abcde");
        CelulaImp celula3 = new Celula("abcdef");

        CelulaImp linha = new Linha();
        CelulaImp linha1 = new Linha();

        ((Linha) linha).adicionar(celula);
        ((Linha) linha).adicionar(celula1);

        ((Linha) linha1).adicionar(celula2);
        ((Linha) linha).adicionar(celula3);


        CelulaImp tabela = new Tabela();
        ((Tabela) tabela).adicionar(linha);
        ((Tabela) tabela).adicionar(linha1);

        tabela.imprimir();

    }
}
