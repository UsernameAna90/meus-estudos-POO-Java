package herancaparte2;

public final class Visitante extends Pessoa{
    
    //METODO CONSTRUTOR
    public Visitante (String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //Classe pobre, criada apenas para implementar a classe abstrata
}
