package bridge2;

public class Programa {
    public static void main(String[] args) {
        ListaImpl caracteres = new ListaOrdenada();
        caracteres.adicionar("a");
        caracteres.adicionar("z");
        caracteres.adicionar("t");
        caracteres.adicionar("f");

        AbstracaoImpressao ordenada = new ItensCaracteres(caracteres);
        ordenada.imprimeItens();

        ListaImpl numeros = new ListaOrdenada();
        numeros.adicionar("1");
        numeros.adicionar("50");
        numeros.adicionar("15");
        numeros.adicionar("4");

        AbstracaoImpressao ordenada1 = new ItensNumeradores(numeros);
        ordenada1.imprimeItens();

        ListaImpl letras = new ListaDesordenada();
        letras.adicionar("a");
        letras.adicionar("b");
        letras.adicionar("c");
        letras.adicionar("d");

        AbstracaoImpressao desordem = new ItensCaracteres(letras);
        desordem.imprimeItens();


        ListaImpl simbolos = new ListaDesordenada();
        simbolos.adicionar("@");
        simbolos.adicionar("#");
        simbolos.adicionar("%");

        AbstracaoImpressao desordem1 = new ItensSimbolos(simbolos);
        desordem1.imprimeItens();

    }
}
