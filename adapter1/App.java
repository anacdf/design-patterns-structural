package adapter1;

public class App {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3,4,5},{6,7,8,9,10}};

        Adapter adapter = new Adapter(matriz);

        adapter.forEach((c, v)-> {
            System.out.println(c.toString() + "=" + v);
        });
    }
}
