package biblioteca;

public class Livro implements Publicacao{
    
    //DECLARANDO ATRIBUTOS
    private String tituloLivro;
    private String autorLivro;
    private int totalPagLivro;
    private int pagAtualLivro;
    private boolean aberto;
    private Pessoa leitorLivro;
    
    //DECLARANDO MÉTODOS AUXILIARES
    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getTotalPagLivro() {
        return totalPagLivro;
    }

    public void setTotalPagLivro(int totalPagLivro) {
        this.totalPagLivro = totalPagLivro;
    }
    
    public int getPagAtualLivro() {
        return pagAtualLivro;
    }

    public void setPagAtualLivro(int pagAtual) {
        this.pagAtualLivro = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitorLivro() {
        return leitorLivro;
    }

    public void setLeitorLivro(Pessoa leitorLivro) {
        this.leitorLivro = leitorLivro;
    }
    
    //DECLARANDO MÉTODO CONSTRUTOR
    public Livro(String titulo, String autor, int paginas, Pessoa leitor){
        this.setTituloLivro(titulo);
        this.setAutorLivro(autor);
        this.setTotalPagLivro(paginas);
        this.setPagAtualLivro(0);
        this.setAberto(false);
        this.setLeitorLivro(leitor);
    }
    
    //DECLARANDO MÉTODOS DE INTERFACE
    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("O livro está aberto!");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("O livro está fechado!");
    }

    @Override
    public void folhear(int num) {
        
        if (this.isAberto()) {
            this.setPagAtualLivro(this.getPagAtualLivro() + num);
            if (this.getPagAtualLivro() < this.getTotalPagLivro()) {
                System.out.println("Páginas folheadas! Página atual: " + this.getPagAtualLivro());
            } else {
                this.setPagAtualLivro(this.getTotalPagLivro());
                System.out.println("Páginas folheadas! Página atual: página final!");
            }
        } else {
            System.out.println("Livro fechado, impossível folhear!");
        }
    }

    @Override
    public void avancarPag() {
        
        if (this.isAberto()) {
            if (this.getPagAtualLivro() < this.getTotalPagLivro()) {
                this.setPagAtualLivro(this.getPagAtualLivro() + 1);
                System.out.println("Página avanaçada! Página atual: " + this.getPagAtualLivro());
            } else {
                System.out.println("Página final, impossível avançar página!");
            }      
        } else {
            System.out.println("Livro fechado, impossível avançar página!");
        }
    }

    @Override
    public void voltarPag() {
        
        if (this.isAberto()) {
            if (this.getPagAtualLivro() > 0) {
                this.setPagAtualLivro(this.getPagAtualLivro() - 1);
            } else {
                System.out.println("Página inicial, impossível voltar página!");
            }
        } else {
            System.out.println("Livro fechado, impossível voltar página!");
        }
    }
    
    //DECLARANDO MÉTODOS COMPORTAMENTAIS
    public void detalhesLivro() {
       if (this.isAberto()) {
            System.out.println("------------------------------------------------------------------------");
            System.out.printf("\nO livro \"%s\" foi estrito pelo autor \"%s\", e possui %d páginas. ", this.getTituloLivro(), this.getAutorLivro(), this.getTotalPagLivro());
            System.out.printf("\nAtualmente, encontra-se em posse do leitor %s que está na página %d!\n", leitorLivro.getNomePessoa(), this.getPagAtualLivro());
       } else {
            System.out.println("------------------------------------------------------------------------");
            System.out.printf("\nO livro \"%s\" foi estrito pelo autor \"%s\", e possui %d páginas. ", this.getTituloLivro(), this.getAutorLivro(), this.getTotalPagLivro());
            System.out.printf("\nAtualmente, encontra-se em posse do leitor %s que está com o livro fechado!\n", leitorLivro.getNomePessoa());
       }
    }
}
