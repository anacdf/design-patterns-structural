package composite1;

import java.util.ArrayList;

//represetacao de uma PASTA
public class ArquivoComposite extends ArquivoComponent{
    private String nomeArquivo;
    private ArrayList<ArquivoComponent> arquivos = new ArrayList<>();


    public ArquivoComposite(String nomeArquivo) {
        super(nomeArquivo);
        this.nomeArquivo = nomeArquivo;

    }

    @Override
    public void printNomeArquivo() {
        System.out.println(nomeArquivo);
        for (ArquivoComponent arquivoTmp : arquivos) {
            arquivoTmp.printNomeArquivo();
        }
    }

    @Override
    public void adicionar(ArquivoComponent arquivo) {
        arquivos.add(arquivo);
    }

    @Override
    public void remover(String nomeArquivo) throws RuntimeException {
        for (ArquivoComponent arquivoTmp : arquivos) {
            if (arquivoTmp.getNomeArquivo() == nomeArquivo) {
                this.arquivos.remove(arquivoTmp);
                return;
            }
        }
        throw new RuntimeException("Não existe este arquivo");
    }

    @Override
    public ArquivoComponent getArquivo(String nomeArquivo) throws RuntimeException {
        for (ArquivoComponent arquivoTmp : arquivos) {
            if (arquivoTmp.getNomeArquivo() == nomeArquivo) {
                return arquivoTmp;
            }
        }
        throw new RuntimeException("Não existe este arquivo");
    }
}
