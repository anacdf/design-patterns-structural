package composite1;

public class App {
    public static void main(String[] args) {
        ArquivoComponent pasta = new ArquivoComposite("Pasta");
        ArquivoComponent foto = new ArquivoImagem("foto.jpg");
        ArquivoComponent foto2 = new ArquivoImagem("foto2.jpg");
        ArquivoComponent video = new ArquivoVideo("video.avi");

        pasta.adicionar(foto);
        pasta.adicionar(foto2);
        pasta.adicionar(video);
        pasta.printNomeArquivo();

    }
}
