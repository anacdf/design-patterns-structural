package decorator1;

public class Interceptador2 implements Componente {
    private Componente componente;

    public Interceptador2(Componente componente) {
        this.componente = componente;
    }

    @Override
    public void executarTarefa() throws InterruptedException {
        long tempo = System.currentTimeMillis();
        long antes = System.currentTimeMillis();
        long depois = System.currentTimeMillis();

        if(tempo%2==0){
            System.out.println("Execucao interrompida em minuto par: "+System.currentTimeMillis());
        }
        else
        componente.executarTarefa();
        System.out.println((depois - antes) + " ms");
    }
}
