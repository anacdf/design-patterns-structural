package decorator2;

public class Chaves extends NumeroDecorator {
    NumeroUm novonumeroUm;

    public Chaves(NumeroUm novonumeroUm) {
        super(novonumeroUm);
    }

    @Override
    public String imprimir(){
        return "{"+ super.imprimir() +"}";
    }
}
