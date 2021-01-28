package heranca;

public class PessoaGenerica {
String nome, RG, cpf, endereco, telFixo,telCelular, dataNascimento;
//método simples para montar e retornar uma String com os dados da Pessoa
public String retornaDados() {
String dados = "";
dados += "Nome: " + nome + "\n";
dados += "\tRG: " + RG + "\n";
dados += "\tCPF: " + String.valueOf(cpf) + "\n";
dados += "\tTelefone fixo: " + telFixo + "\n";
dados += "\tTelefone cel.: " + telCelular + "\n";
return dados;

}

}
