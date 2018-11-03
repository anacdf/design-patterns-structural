package composite1;

public abstract class ArquivoComponent {
    private String nomeArquivo;

    public ArquivoComponent(String nomeArquivo){
        this.nomeArquivo=nomeArquivo;
    }

    //acoes apenas para arquivos
    public void printNomeArquivo(){
        System.out.println(this.nomeArquivo);
    }

    public String getNomeArquivo(){
        return this.nomeArquivo;
    }

    //acoes apenas para pastas
    public void adicionar(ArquivoComponent arquivo) throws RuntimeException{
        throw new RuntimeException("Não pode inserir arquivos em: "
                + this.nomeArquivo + " - Não é uma pasta");
    }

    public void remover(String arquivo) throws RuntimeException{
        throw new RuntimeException("Não pode inserir arquivos em: "
                + this.nomeArquivo + " - Não é uma pasta");
    }

    public ArquivoComponent getArquivo(String nomeArquivo) throws RuntimeException{
        throw new RuntimeException("Não pode inserir arquivos em: "
                + this.nomeArquivo + " - Não é uma pasta");
    }
}
