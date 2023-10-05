/*
* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
* soma desses números com uma mensagem explicativa.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);

        int num1, num2;
        num1 = n1.nextInt();
        num2 = n2.nextInt();
        int resul = num1 + num2;
        System.out.println("SOMA = " + resul);

    }
}