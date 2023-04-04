package br.com.jedualmeida.exercicios.loops;

import java.util.Scanner;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;
        String sair = "n";

        while (sair.equals("n")) {

            System.out.println("<<<< Gerador de Tabuada >>>>");
            System.out.println("Digite um número de 1 a 10: ");
            tabuada = scan.nextInt();

            if (tabuada >= 1 && tabuada <= 10) {
                System.out.println("---------------------------");
                System.out.println("Tabuada de " + tabuada + ":");

                for (int i = 1; i <= 10; i++) {
                    System.out.println(tabuada + " x " + i + " = " + (tabuada * i));

                }

                System.out.println("-------------------------------");
                System.out.println("Deseja sair? S - sim / N - não ");
                sair = scan.next();

            } else
                System.out.println("Número Inválido!");

            System.out.println("---------------------------");

        }

    }

}
