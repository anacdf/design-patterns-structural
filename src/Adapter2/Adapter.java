package Adapter2;

import java.util.List;

public class Adapter implements SomadorEsperado{

   private SomadorExistente adaptee;
   List<Integer> lista;

   public Adapter (SomadorExistente somador){
       this.adaptee = somador;
   }

    @Override
    public int somaVetor(int[] vetor) {
        for (int i=0; i<=vetor.length; i++){
         lista.add(vetor[i]);
        }
        return adaptee.somaLista(lista);
    }

}
