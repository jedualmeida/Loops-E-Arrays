package br.com.jedualmeida.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex01_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;  //O break força a parada do laço de repetição while

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }

        System.out.println("Fim da aplicação!");  //Mensagem exibida após sair do laço while com o break

    }
}
