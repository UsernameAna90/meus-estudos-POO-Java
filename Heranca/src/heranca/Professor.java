package heranca;

public class Professor extends Pessoa{
    
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
    
    //METODOS COMPORTAMENTAIS
    public void receberAumento(float aumento) {
        this.setSalario(aumento);
    }
}
