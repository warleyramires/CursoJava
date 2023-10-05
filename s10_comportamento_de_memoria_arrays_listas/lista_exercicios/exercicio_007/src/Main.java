/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
* */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor");
        int tamanhoVetor = sc.nextInt();
        double[] vect = new double[tamanhoVetor];
        double media = 0, soma =0;

        for (int i = 0; i < vect.length; i++ ){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        media = soma/vect.length;
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (double num : vect){
            if(num < media){
                System.out.println(num);
            }
        }

        sc.close();
    }
}