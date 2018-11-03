package decorator2;

public class ProgramaDecorator {
    public static void main(String[] args) {
        NumeroUm numeroUm = new NumeroUm();
        System.out.println(numeroUm.imprimir());
        System.out.println("");

        numeroUm = new Chaves(numeroUm);
        System.out.println(numeroUm.imprimir());
        System.out.println("");

        numeroUm = new Parenteses(numeroUm);
        System.out.println(numeroUm.imprimir());
        System.out.println("");

        NumeroUm outro = new NumeroUm();
        outro = new Parenteses(outro);
        System.out.println(outro.imprimir());
    }
}
