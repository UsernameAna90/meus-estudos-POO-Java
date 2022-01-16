package metodosauxiliares;

public class Musica {
    //Declarando atributos da música
    private String titulo;
    private String genero;
    private String cantor;
    
    //Declarando métodos modificadores:
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setCantor(String cantor){
        this.cantor = cantor;
    }
    
    //Declarando métodos acessores:
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getGenero() {
        return this.genero;
    }
    
    public String getCantor() {
        return this.cantor;
    }
    
    //Declarando método construtor
    public Musica(String tit, String gen, String can) {
        this.titulo = tit;
        this.genero = gen;
        this.cantor = can;
    } 
    
    //Declarando método "Status"
    public void status(){
        System.out.printf("Minha música favorita do %s se chama %s!\n", this.cantor, this.titulo);
        System.out.printf("O gênero musical é chamado %s!\n", this.genero);
    }
}
