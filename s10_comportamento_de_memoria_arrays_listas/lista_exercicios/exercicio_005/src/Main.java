/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
* */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();
        double[] vect = new double[qtd];
        double maior = vect[0];
        int posicao = 0;
        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um nuemero");
            vect[i] = sc.nextDouble();

        }

        for(int i = 0; i < vect.length; i++){
            if(vect[i] >= maior){
                maior = vect[i];
                posicao = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
        sc.close();
    }
}