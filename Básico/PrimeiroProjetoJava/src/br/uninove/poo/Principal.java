package br.uninove.poo;
//public = modificador de acesso 

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String nome;
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = ler.nextLine();
        System.out.println("Seja bem-vindo \n" + nome);
        System.out.println(nome);
        System.out.println("Digite sua idade");
        n = ler.nextInt();
        System.out.println("\nSua idade é" + n);

        //Começando a tabalhar com objetos...
        Pessoa p1 = new Pessoa();
        p1.nome = "Leandro";
        p1.idade = 27;
        p1.cpf = "123.123.123-12";
        System.out.println("Nome:" + p1.nome);
        System.out.println("Cpf:" + p1.cpf);
        System.out.println("Idade" + p1.idade);
    }
}
