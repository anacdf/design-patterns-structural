package adapter2;

import java.util.ArrayList;

public class AdapterDemo {
    public static void main(String[] args) {

        SomadorExistente somadorExistente = new SomadorExistente();
        SomadorEsperado adapter = new Adapter(somadorExistente);
        Cliente cliente = new Cliente(adapter);
        cliente.executar();

    }
}
