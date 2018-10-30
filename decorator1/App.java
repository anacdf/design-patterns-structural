package decorator1;

public class App {
    public static void main(String[] args) {
        Componente componente = new ComponenteConcreto();
        Componente componente2 = new Interceptador1(componente);
    }
}
