package decorator2;

public abstract class NumeroDecorator extends NumeroUm {
    private NumeroUm numeroUm;


    public NumeroDecorator(NumeroUm novonumeroUm){
        numeroUm = novonumeroUm;

    }

    @Override
    public String imprimir(){
        return numeroUm.imprimir();
    }
}
