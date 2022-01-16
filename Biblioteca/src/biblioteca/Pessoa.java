package biblioteca;

public class Pessoa {
    
    //DECLARANDO ATRIBUTOS
    private String nomePessoa;
    private int idadePessoa;
    private String sexoPessoa;
    
    //DECLARANDO MÉTODOS AUXILIARES
    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public String getSexoPessoa() {
        return sexoPessoa;
    }

    public void setSexoPessoa(String sexoPessoa) {
        this.sexoPessoa = sexoPessoa;
    }
    
    //CRIANDO MÉTODO CONSTRUTOR
    public Pessoa(String nome, int idade, String sexo) {
        this.setNomePessoa(nome);
        this.setIdadePessoa(idade);
        this.setSexoPessoa(sexo);
    }
    
    //CRIANDO MÉTODOS COMPORTAMENTAIS
    public void fazerAniversario() {
        this.setIdadePessoa(this.getIdadePessoa() + 1);
        
        System.out.println("Parabéns, você completou mais um ano de vida!");
    }
    
    public void statusPessoa() {
        System.out.println("-------------------------------");
        System.out.println("Nome: " + this.getNomePessoa());
        System.out.println("Idade: " + this.getIdadePessoa());
        System.out.println("Sexo: " + this.getSexoPessoa());
        System.out.println("-------------------------------");
    }
    
}
