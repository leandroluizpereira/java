
package br.calculadora.imc;

public class Imc {
    float peso, altura, imc;
    String classificacao;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    public float calculaIMC(){
       float imc = peso/(altura * altura);
       geraClassificacao();
       return imc;
    }
    public String geraClassificacao(){
        if(imc <= 18.5) {
            classificacao = "Abaixo do peso";
        } else if(imc >= 18.6 && imc <= 24.9) {
            classificacao = "Peso ideal";
        } else if(imc >= 25 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else if(imc >= 30 && imc <= 34.9) {
            classificacao = "Obesidade grau I";
        } else if(imc >= 35 && imc <= 39.9) {
            classificacao = "Obesidade grau II";
        } else if(imc >= 40) {
            classificacao = "Obesidade grau III";
        } 
        
        return classificacao;
    }
    
}

