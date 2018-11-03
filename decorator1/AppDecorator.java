package decorator1;

public class AppDecorator {
    public static void main(String[] args) {
        Componente componente = new ComponenteConcreto();
        Componente componente2 = new Interceptador1(componente);

        try {
            componente2.executarTarefa();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Componente componente3 = new Interceptador2(componente);
        try {
            componente3.executarTarefa();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
