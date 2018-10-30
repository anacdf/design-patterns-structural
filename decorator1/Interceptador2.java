package decorator1;

public class Interceptador2 implements Componente {
    private Componente componente;
    public Interceptador2(Componente componente) {
        this.componente = componente;
    }
}
