package adapter2;

public class AdapterDemo {
    public static void main(String[] args) {

        SomadorExistente somadorExistente = new SomadorExistente();
        SomadorEsperado adapter = new Adapter(somadorExistente);
        Cliente cliente = new Cliente(adapter);
        cliente.executar();

    }
}
