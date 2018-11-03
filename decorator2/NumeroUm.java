package decorator2;

/*
Crie uma classe NumeroUm que tem um método imprimir() que imprime o número “1” na tela.
Implemente decoradores  para  colocar  parênteses,  colchetes  e  chaves  ao  redor  do  número  (ex.:  “{1}”).
Combine-os de diversas formas.
 */

public class NumeroUm {
    private String num= "1";

    public String imprimir(){
        return num;
    }
}
