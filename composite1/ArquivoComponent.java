package composite1;
//O padrão Composite serve para implementar uma árvore de itens e tratar todos os nós, folhas ou não, de
//maneira uniforme. Implemente classes que representem um sistema de arquivos, com pastas e arquivos.
//Pastas possuem nome e diversos arquivos e subpastas. Arquivos possuem nome e tamanho em KB. Seu
//programa deve navegar pela árvore e imprimir seus itens e tamanhos.

public abstract class ArquivoComponent {
    private String nomeArquivo;

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
