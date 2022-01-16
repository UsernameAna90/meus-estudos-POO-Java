package polimorfismo;

public class Reptil extends Animal {
    
    //ATRIBUTOS
    protected String corEscama;
    
    //METODOS AUXILIARES
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //SOBRESCRICAO DOS METODOS HERDADOS
    @Override
    public void locomover() {
        System.out.println("Repteis rastejam!");
    }

    @Override
    public void alimentar() {
        System.out.println("Repteis se alimentam de vegetais!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de reptil!");
    }
    
}
