package br.com.jedualmeida.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex01_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, 0, 15, 50, 8, 4};

        System.out.print("Vetor: ");  //Sem o ln no print para imprimir um na frente do outro, sem quebra de linha
        int count = 0;
        while (count < vetor.length) {  //.length retorna o tamanho do vetor/array

            System.out.print(vetor[count] + ", ");
            count++;

        }

        System.out.print("\nVetor na ordem inversa: ");  //Para quebra de linha usado o \n no print
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + ", ");

        }
    }
}
