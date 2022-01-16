package polimorfismosobrecarga;

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
    
    //METODOS SOBRESPOSTOS
    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de mamífero!");
    }
}
