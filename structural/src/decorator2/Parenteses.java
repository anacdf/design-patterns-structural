package decorator2;

public class Parenteses extends NumeroDecorator {
    NumeroUm novonumeroUm;

    public Parenteses(NumeroUm novonumeroUm) {
        super(novonumeroUm);
    }

    @Override
    public String imprimir(){
        return "("+super.imprimir()+")";
    }
}
