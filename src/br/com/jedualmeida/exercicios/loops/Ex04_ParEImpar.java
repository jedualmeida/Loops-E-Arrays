package br.com.jedualmeida.exercicios.loops;

import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex04_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int par = 0 , impar = 0;  //Variáveis do mesmo tipo podem ser declaradas desta forma também

        System.out.println("Quantidade de Números: ");
        quantNumeros = scan.nextInt();
        int count = 0;
        do {
            System.out.println("Qual Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) par++;
            else impar++;

            count++;
        } while (count < quantNumeros);

        System.out.println("---------------------------------------");
        System.out.println("Quantidade de Números Pares: " + par);
        System.out.println("Quantidade de Números Ímpares: " + impar);

    }

}
