package heranca;

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
    
    //METODOS COMPORTAMENTAIS
    public void cancelarMatricula() {
        this.setMatricula(false);
    }

}
