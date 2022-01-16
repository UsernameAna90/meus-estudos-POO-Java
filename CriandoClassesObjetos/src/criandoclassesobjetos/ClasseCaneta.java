package criandoclassesobjetos;

public class ClasseCaneta {
    //Declarando os atributos da caneta
    String modelo;
    String cor;
    float ponta;
    boolean tampada;
    
    //Declarando as funções da caneta
    public void status() {
        System.out.printf("Caneta modelo %s,", this.modelo);
        System.out.printf(" cor %s,", this.cor);
        System.out.printf(" e ponta tipo %.1f centímetros.\n", this.ponta);
        System.out.printf("Se encontra destampada no momento? Resposta: %b\n", this.tampada);
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void escrever(){
        if (this.tampada == true) {
            System.out.println("A caneta está tampada. Então não posso escrever!");
        } else {
            System.out.println("A caneta está destampada. Então posso escrever!");
        }
    }
    
}
    
