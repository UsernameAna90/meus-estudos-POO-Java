package metodosauxiliares;

public class MetodosAuxiliares {

    public static void main(String[] args) {
        //Criando um objeto "Musica"
        //Musica mus = new Musica();
        
        //Instanciando o objeto "Musica"
        /*
         *mus.setCantor("Brendon Urie");
         *mus.setGenero("Pop Rock");
         *mus.setTitulo("Emperor's New Clothes");
         */

        //System.out.println("Minha música favorita do " + mus.getCantor() + " se chama " + mus.getTitulo() + ".\nSeu gênero é " + mus.getGenero() +"!");
        
        //Os comandos acima foram comentados porque quando a classe é também um método construtor, não se pode chama-la da forma tradicional.
        
        //Criando objetos "Musica com o método construtor"
        Musica mus = new Musica("Emperor's New Clothes", "Pop Rock", "Brendon Urie");
        mus.status();
        
        Musica mus2 = new Musica("Arranjo Luo Ni em G minor", "Música Clássica", "Bach" );
        mus2.status();
    }
    
}
