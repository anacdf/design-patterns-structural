package adapter1;

import java.util.HashMap;
import java.util.Map;

public class Adapter extends HashMap  {

    public Adapter (int[][] matriz){
        for (int i=0; i<matriz[0].length; i++){
            this.put(matriz[0][i], matriz[1][i]);
        }
    }

}
