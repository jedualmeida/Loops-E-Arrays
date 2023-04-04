package br.com.jedualmeida.exercicios.arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") ||  //Compara a string digitada pelo user com a letra "a"
                    letra.equalsIgnoreCase("e") ||  //O método ignorecase é para que não haja distinção
                    letra.equalsIgnoreCase("i") ||  //entre letra maiúscula e minúscula
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u") )) {

                consoantes[count] = letra;
                quantidadeConsoantes++;

            }

            count++;

        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {  //Usar foreach para navegar por todas as posições do array

            if (consoante != null)  //Para que não seja impresso na tela o "null" da posição sem letra atribuída
                System.out.print(consoante + " ");

        }

        System.out.println("\nNº de Consoantes: " + quantidadeConsoantes);

    }

}
