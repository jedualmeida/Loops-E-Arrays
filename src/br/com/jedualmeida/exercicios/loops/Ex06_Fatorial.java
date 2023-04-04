package br.com.jedualmeida.exercicios.loops;

import java.util.Scanner;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial;

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        fatorial = numero;

        for (int i = numero - 1; i >= 1; i--) {

            fatorial = fatorial * i;

        }

        System.out.println("Fatorial de " + numero + "! é: " + fatorial);

    }

}
