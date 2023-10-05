//Fazer um programa para ler quatro valores inteiros
// A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        Scanner n4 = new Scanner(System.in);

        int A, B, C, D;

        A = n1.nextInt();
        B = n2.nextInt();
        C = n3.nextInt();
        D = n4.nextInt();

        int diferenca = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + diferenca);

    }
}