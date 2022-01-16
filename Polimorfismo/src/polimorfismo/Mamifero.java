package polimorfismo;

public class Mamifero extends Animal {
    
    //ATRIBUTOS
    protected String corPelo;
    
    //METODOS AUXILIARES
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    //SOBRESCRICAO DOS METODOS HERDADOS
    @Override
    public void locomover() {
        System.out.println("Mamíferos correm!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamíferos se alimentam de leite!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de mamífero!");
    }
    
}
