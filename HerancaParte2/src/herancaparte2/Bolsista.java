package herancaparte2;

public final class Bolsista extends Aluno {
    
    //ATRIBUTOS
    private String bolsa;
    
    //METODOS AUXILIARES
    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }
    
    //METODO CONSTRUTOR
    public Bolsista (String nome, int idade, String sexo, String curso, String bolsa) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setMatricula(true);
        this.setCurso(curso);
        this.setBolsa(bolsa);
    }
    
    //METODOS
    public final void renovarBolsa() {
        System.out.println("Bolsa renovada!");
    }
    
    public final void informacoes() {
        System.out.printf("Bolsista{nome:%s, idade=%d, sexo=%s, " , this.getNome(), this.getIdade(), this.getSexo());
        System.out.printf("matricula=%s, curso=%s, bolsa=%s}\n", this.isMatricula(), this.getCurso(), this.getBolsa());
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga com desconto!");
    }
}
