package heranca;
  
public class Principal {
public static void main(String args[]) {
Aluno a1 = new Aluno();
Professor p1 = new Professor();


a1.nome = "Leandro Luiz Pereira";
a1.registroAcademico = 01234567890;
a1.cpf = "801.002.003-00";
a1.RG = "999999-X";
a1.curso = "Bacharelado Ciência da computação ";
a1.dataNascimento = "10/01/1981";
a1.dataIngresso = "11/10/2017";
a1.endereco = "Rua das ruas avenida, 99990";
a1.notaVestibular = 87;
a1.telCelular = "(99) 9999-9999";
a1.telCelular = "(99) 9999-9999";



p1.nome = "Mestre Yoda Teacher";
p1.Salario = 8300.00F;
p1.cpf = "900.000.090-10";
p1.dataNascimento = "26/04/1810";
p1.RG = "090101090-Y";
p1.endereco = "Avenida das Galaxias Direita, 01";
p1.matricula = 90020;
p1.telCelular = "(269) 23232";
p1.telFixo = "(129) 1212121";
p1.dataContrato = "21/01/1999";

System.out.println("Dados pessoais do aluno: ");
System.out.println(a1.retornaDados());

System.out.println("Dados pessoais do aluno: ");
System.out.println(a1.retornaDadosAluno());


System.out.println("Dados pessoais do Professor: ");
System.out.println(p1.retornaDadosProfessor());




  }
}
