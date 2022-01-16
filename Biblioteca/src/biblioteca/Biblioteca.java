package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        
        //INSTANCIANDO PESSOA
        Pessoa p1 = new Pessoa("Ana Clara", 21, "Feminino");
        Pessoa p2 = new Pessoa("Lucas Emanuel", 25, "Masculino");
        
        //INSTANCIANDO LIVROS
        Livro l1 = new Livro("Coraline", "Neil Gaiman", 195, p1);
        Livro l2 = new Livro("O retrato de Dorian Gray", "Oscar Wilde", 210, p2);

        //Interagindo com os livros
        l1.detalhesLivro();
        l2.detalhesLivro();
        
        l1.abrir();
        l1.folhear(200);
        
        l2.abrir();
        l2.voltarPag();
        
        l1.detalhesLivro();
        l2.detalhesLivro();
    }
    
}
