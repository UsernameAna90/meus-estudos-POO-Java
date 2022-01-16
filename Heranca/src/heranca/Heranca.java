package heranca;

public class Heranca {

    public static void main(String[] args) {
        
        //INSTANCIANDO ALUNO
        Aluno al1 = new Aluno();
        al1.setNome("Ana Andrade");
        al1.setIdade(21);
        al1.setSexo("Feminino");
        al1.setMatricula(true);
        al1.setCurso("Engenharia de Dados");
        System.out.println(al1.toString()); 
        
        //INSTANCIANDO PROFESSOR
        Professor pf1 = new Professor();
        pf1.setNome("Lucas Emanuel");
        pf1.setIdade(25);
        pf1.setSexo("Masculino");
        pf1.setEspecialidade("Engenharia de Dados");
        pf1.setSalario(5000f);
        System.out.println(pf1.toString()); 
        
        //INSTANCIANDO FUNCIONARIO
        Funcionario fc1 = new Funcionario();
        fc1.setNome("Pedro Moreira");
        fc1.setIdade(33);
        fc1.setSexo("Masculino");
        fc1.setSetor("Tecnologia da Informação");
        fc1.setTrabalhando(true);
        System.out.println(fc1.toString()); 
    }
    
}
