package bridge;

public class Pedidos {
    public static void main(String[] args) {

        ImplementacaoRefrigerante cocaCola = new CocaCola();
        AbstracaoTamanho pequeno = new TamanhoPequeno(cocaCola);

        pequeno.beber();

        ImplementacaoRefrigerante guarana = new Guarana();
        AbstracaoTamanho medio = new TamanhoMedio(guarana);

        medio.beber();

        ImplementacaoRefrigerante fanta = new Fanta();
        AbstracaoTamanho grande = new TamanhoGrande(fanta);

        grande.beber();

        AbstracaoTamanho peq = new TamanhoPequeno(fanta);
        peq.beber();
        AbstracaoTamanho med = new TamanhoMedio(cocaCola);
        med.beber();
        AbstracaoTamanho gr = new TamanhoGrande(guarana);
        gr.beber();
    }
}
