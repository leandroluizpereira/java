package heranca;

public class Professor extends PessoaGenerica { 
int matricula;
String dataContrato;
float Salario;

public String retornaDadosProfessor() {
String dados;
dados = super.retornaDados();
dados += "\tData de contrato: " + dataContrato + "\n";
dados += "\tSalario: " + Salario + "\n";
return dados;

}
}
