/*
- Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
* */

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma = 0, media;

        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um número");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }


        System.out.print("VALORES = ");
        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.println();
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("SOMA = %.2f\n", soma/n);

        sc.close();
    }
}