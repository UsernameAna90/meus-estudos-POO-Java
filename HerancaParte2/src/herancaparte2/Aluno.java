package herancaparte2;

public class Aluno extends Pessoa{
    
    //ATRIBUTOS
    private boolean matricula;
    private String curso;
    
    //METODOS AUXILIARES
    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //METODOS
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga, " + this.getNome() + "!");
    }
}
    
