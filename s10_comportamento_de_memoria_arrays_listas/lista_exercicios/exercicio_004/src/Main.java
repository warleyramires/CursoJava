/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int qtdNumeros = sc.nextInt();
        int qtdPares = 0;
        int[] vect = new int[qtdNumeros];

        for(int i =0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
            if(vect[i] % 2 == 0) {
                qtdPares += 1;
            }
        }

        int[] vectPares = new int[qtdPares];
        int parIndex = 0;
        for (int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0) {
                vectPares[parIndex] = vect[i];
                parIndex++;
            }
        }

        System.out.println("NUMEROS PARES: ");
        for(int par : vectPares){
            System.out.printf(" %d", par);
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qtdPares);


        sc.close();
    }
}