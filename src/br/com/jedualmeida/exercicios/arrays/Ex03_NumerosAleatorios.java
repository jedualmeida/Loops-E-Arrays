package br.com.jedualmeida.exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();  //Para gerar números aleatórios

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {

            int numero = random.nextInt(100);  //Para inferir que devem ser números aleatórios até 100
            numerosAleatorios[i] = numero;

        }

        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("\nSucessores: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("\nAntecessores: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }

        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("\nOs dobros: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero * 2) + " ");
        }

    }
}
