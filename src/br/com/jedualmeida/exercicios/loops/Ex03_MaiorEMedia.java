package br.com.jedualmeida.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Digite um Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count++;

        } while (count < 5);

        System.out.println("O Maior Número foi: " + maior);
        System.out.println("A Soma dos Números foi: " + soma);
        System.out.println("A Média dos Números foi: " + (soma / count));

    }
}
