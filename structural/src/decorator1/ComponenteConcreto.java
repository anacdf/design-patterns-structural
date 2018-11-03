package decorator1;

public class ComponenteConcreto implements Componente {
    public void executarTarefa() throws InterruptedException {
        Thread.sleep(2000);
    }
}
