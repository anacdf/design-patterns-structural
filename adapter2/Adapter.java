package adapter2;

import java.util.ArrayList;
import java.util.List;

public class Adapter implements SomadorEsperado{

   private SomadorExistente adaptee;


   public Adapter (SomadorExistente somador){
       this.adaptee = somador;
   }

    @Override
    public int somaVetor(int[] vetor) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i=0; i<vetor.length; i++){
         lista.add(vetor[i]);
        }
        return adaptee.somaLista(lista);
    }

}
