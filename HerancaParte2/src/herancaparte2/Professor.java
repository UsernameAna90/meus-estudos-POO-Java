package herancaparte2;

public final class Professor extends Pessoa {
    
    //ATRIBUTOS
    private String especialidade;
    private float salario;
    
    //METODOS AUXILIARES
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //METODO CONSTRUTOR
    public Professor (String nome, int idade, String sexo, String especialidade, float salario) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }
    
    //METODOS 
    public final void receberAumento(float aumento) {
        this.setSalario(this.getSalario() + aumento);
        System.out.println("Você recebeu um aumento de R$" + aumento);
    }
}
