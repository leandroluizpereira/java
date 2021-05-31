# :books: Anotaçôes sobre a linguagem Java 

## Tópicos 
* :star: básico
* [Sobre a linguagem java](#java)
* [Declaraçâo de variável](#variavel)
* [Interpolaçâo de variável](#interpolacao)
* [Operadores Aritimético](#ari)
* [Operadores Lógicos](#log)
* [Funçâo de entrada](#entrada)
* [Estrutura condicional -if](#if)
* [Estrutura de repetiçâo - for](#for)
* :star::star:Intermediário
* [Orientaçâo a objeto](#objeto)
  * Modificadores de acesso
  * Polimorfismo
  * Encapsulamento
  * Herança 
  * Override
* Extras:
* [Programas](#programas)
  * [Neat beans - java web](#)



<div id="java">
 
 ## Sobre a linguagem Java
 
 <p>Java é uma linguagem de programação orientada a objetos desenvolvida na década de 90 por uma equipe de programadores chefiada por James Gosling, na empresa Sun Microsystems. Em 2008 o Java foi adquirido pela empresa Oracle Corporation. Diferente das linguagens de programação modernas, que são compiladas para código nativo, a linguagem Java é compilada para um bytecode que é interpretado por uma máquina virtual (Java Virtual Machine, mais conhecida pela sua abreviação JVM). A linguagem de programação Java é a linguagem convencional da Plataforma Java, mas não é a sua única linguagem. J2ME Para programas e jogos de computador, celular, calculadoras, ou até mesmo o rádio do carro. </p>
 
<div id="variavel">
 
# :star: Básico
 
## Declaração de variável 

```java
public class OlaMundo{
public static void main(String[] args){
String name = "Leandro Luiz Pereira";
int number = 30;
float dolar = 350;
double real =  123230.43;
boolean on = true;
final String cidade = "São Paulo";
//variavél final não pode ser alterado
}
}
```
<div id="interpolacao">
 
## Interpolaçâo de variável
 
<div id="variavel">
 
```java 
public class OlaMundo{
public static void main(String[] args){
String name = "Leandro Luiz Pereira";
int number = 38;
boolean on = true;
System.out.println("O meu nome é "+name+" e tenho "+number+" livros "\n está afirmaação é +on);
}
}
```
<div id="ari">
 
## Operadores Aritiméticos

 ```java 
public class HelloWorld{
public static void main(String[] args){
int n = 30;
int n2 = 45;
int n3 = 60;
int mult,soma,div,subtracao; 

soma = n + n2 + n3;
System.out.println(soma);

subtracao = n - n2 - n3;
System.out.println(subtracao);

mult = n* n2 *n3;
System.out.println(mult);
  
div = (n+n2) /n3;
System.out.println(div);
 }
}
```
 <div id="log">
 
## Operadores Lógicos

```java
public class HelloWorld{
public static void main(String[] args){
int n = 30;
int n2 = 56;
int n3 = 66;
    
if (n > 30 && n2 <34){
System.out.println("Verdadeiro");
}
else{
System.out.println("Falso");
}

if (n > 30 || n3 >34){
System.out.println("Verdadeiro");
}
else{
System.out.println("Falso");
}

if (n > 30 == n2 <34){
System.out.println("Verdadeiro");
}    
else{
System.out.println("Falso");
}

}
}

```

 <div id="entrada">
 
 ## Funçâo de entrada
 
 Estanciando a classe Scanner para leitura 
 
 ```java
 Scanner ler = new Scanner(System.in)
 ```
 métodos do Scanner :
 
 * número inteiro = nextInt()
 * String = nextLine();
 * Float = nextFloat();
 * double = nextDouble();
 
 exemplo de tabuada com Scanner de entrada.
 ```java 
import java.util.Scanner;
public class FuncaoEntrada {
    public static void main(String[] args) {     
        Scanner ler = new Scanner(System.in);      
        System.out.println("Digite um número");
        int n = ler.nextInt();
        for(int i=0;i<11;i++){
        int mult = n*i;     
            System.out.println(" "+n+" X "+i+" "+mult);      
    }  
    }
}

 
 ```

 <div id="if">
 
 ## Estrutura condicional - if 
 
 ```java 
 public class OlaMundo{
 public static void main (String [] args){
 
 int n=30;
 int n2=43;
 
 System.out.println("Estrutura if :\n");
 
 if (n > n2){
   System.out.println("verdadeiro");
 }
 else{
   System.out.println("Falso");
 } 
 }
 }
 ```
 <div id="for">
 
 ## Estrutura de repetiçâo - for 
 
 ```java
 public class OlaMundo{
public static void main(String [] args){
 for(int i=0;i<11;i++){
 System.out.println(i);
}
}
 ```
 
<div id="objeto">
 
 # :star::star: Intermediário

## Orientaçâo a objeto

## Modificadores de acesso

<strong>Private =</strong> só a classe designado pode alterar. <br>
<strong>Public = qualquer</strong> classe pode alterar, independente do pacote que esteje, interno ou externo. <br>
<strong>Protected =</strong> so as classes que estão no pacote pode alterar. 

## Polimorfismo 
sobrecarga de método , métodos com mesmo nome .
```java 



```
## Encapsulamento 
Métodos getter e setters , reforça a proteçâo das variáveis.


## herança 


## Override 
sobrepoe o método de outra classe 

```java 
public class OlaMundo{
public static void main(String[] args){
@ override 
public String toString(){
  String cursoToString = "Curso:"+nomeCurso + "\nCarga Horária:" + getCargaHoraria()
 + "\nDisciplinas:";
for(Disciplinas disc :disciplinas){
    cursoToString +="\t - "+ disc.getNome() +"
}
}
```
<div id="programas">
 
 ## Programas 
 
| <div align=center> Software |  <div align=center>Site |  <div align=center>Autor|   <div align=center>   Classificaçâo            |
|--|--|--|--|
| <div align=center>NeatBeans |<div align=center>:x:|<div align=center> Apache Software Foundation| <div align=center>:star::star::star::star::star:|
|<div align=center> Android  Studio  |<div align=center>:x:  |<div align=center> Google  | <div align=center>:star::star::star::star::star: | 
 |  |  |  | <div align=center>:star::star::star: | 
 
 
 ** Extras 
 
<p> Preparação do Ambiente de desenvolvimento
Prof. Thiago G. Traue edited this page on 22 Mar · 4 revisions
Para preparar o ambiente de desenvolvimento, recomenda-se seguir cuidadosamente este processo: </p>


<p> Verificar se você possui o JRE instalado em sua máquina
Abrir o terminal e digitar "java -version"
Não pode dar erro (tipo, comando não reconhecido)
Se der algum erro, baixar e instalar o java </p> [NESTE SITE](https://www.java.com/pt-BR/)

<p>
Baixar e instalar o Netbeans 8.2, com JDK
Link: CLIQUE AQUI
Baixar a versão correta para seu Sistema Operacional (32 ou 62bit)
Instalar normalmente: CUIDADO: A pasta de instalação (netbeans e JDK) não pode conter espaços nem caracteres especiais </p>


<p>
Instalar os plug-ins do JEE
Após a instalação, clicar em "Ferramentas" -> "Plug-ins"
Clicar na guia "Plugins disponíveis", e buscar pelo termo "Java EE"
Selecionar:
Java EE Base
EJB e EAR
Clicar no botão "Instalar"
Aceitar os termos de licença e instalar normalmente.
Clicar para reiniciar o Netbeans  </>

<p>
Testar o Netbeans para projetos JEE
Clicar em "Arquivo" -> "Novo projeto"
Verificar se em "Catergoria" aparece "Java Web"
Somente isso. Não é necessário criar o projeto neste ponto </p>


<p>
Instalação do Glassfish
Baixar o glassfish "Web Profile", DESTE LINK
Extrair para um local seguro (recomendação/exemplo: "C:\glassfish5")
Checar se dentro dessa pasta há três pastas e um readme
No Netbeans, clicar em "Janela" -> "Serviços" (clique para fechar a aba "Página inicial")
Em servidores, clicar com o botão direito e "Adicionar Servidor"
Selecionar "Glassfish Server" e clicar em próximo
Clicar no botão "Procurar". Selecionar o caminho onde o Glassfish foi extraído (apenas selecionar a pasta RAIZ do Glassfish)
Clicar em próximo
Trocar a porta: Trocar "domain1" para "domain2" (por exemplo). Desmarcar "default" e colcoar as portas 4849 e 8081 respectivamente (fazemos isso pois vocês possuem aula de Oracle que utiliza um Glassfish na mesma porta e pode dar conflito)
Finalizar
Clicar em "Não" ao ser exibida a mensagem de "Mostrar relatório"
Para testar, clicar com o botão direito no Glassfish e "Iniciar"
Se o sistema operacional pedir permissão para o "defender" (usuários de Windows), permitir <p>

<p>
Alterar a pasta de instalação do JavaDB
Na mesma tela de serviços, expandir "Bancos de dados"
Clicar com o botão direito em "JavaDB" -> "Propriedades"
No primeiro campo, procurar a pasta do Glassfish e seleciona a pasta interna "javadb"
Clicar em Ok </p>







