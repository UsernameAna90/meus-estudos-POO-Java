package herancaparte2;

public final class Tecnico extends Aluno {
    
    //ATRIBUTOS
    private String registroProfissional;
    
    //METODOS AUXILIARES
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    //METODO CONSTRUTOR
    public Tecnico (String nome, int idade, String sexo, String curso, String reg) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setMatricula(true);
        this.setCurso(curso);
        this.setRegistroProfissional(reg);
    }
    
    //METODOS
    public final void praticar() {
        System.out.println("Praticando!");
    }
    
    public final void informacoes() {
        System.out.printf("Tecnico{nome:%s, idade=%d, sexo=%s, " , this.getNome(), this.getIdade(), this.getSexo());
        System.out.printf("matricula=%s, curso=%s, registro=%s}\n", this.isMatricula(), this.getCurso(), this.getRegistroProfissional());
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga!");
    }
}
