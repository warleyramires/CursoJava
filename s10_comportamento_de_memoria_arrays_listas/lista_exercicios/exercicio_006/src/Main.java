/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor? ");
        int tamVect = sc.nextInt();

        int[] vect1 = new int[tamVect];
        int[] vect2 = new int[tamVect];
        int[] vectResultate = new int[tamVect];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vect1.length; i++){
            vect1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i =0; i< vect2.length;i++){
            vect2[i] = sc.nextInt();
        }
        for (int i = 0;i< vectResultate.length;i++){
            vectResultate[i] = vect1[i] + vect2[i];
        }

        for (int valor : vectResultate){
            System.out.println(valor);
        }

        sc.close();
    }
}