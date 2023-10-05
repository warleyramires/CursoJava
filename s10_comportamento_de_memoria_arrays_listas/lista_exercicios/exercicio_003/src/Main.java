/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.

* */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");

        int qtdPessoas = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[qtdPessoas];
        double porcentagemIdade16;
        int totalMenos16 = 0;
        double somaTodasAlturas = 0;

        sc.nextLine();

        for(int i = 0; i < pessoas.length; i++){

            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.println("Nome: ");

            String nome = sc.nextLine();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);

            sc.nextLine();

        }
        for (int i = 0; i < pessoas.length;i++){
            somaTodasAlturas += pessoas[i].getAltura();
        }
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                totalMenos16++;
            }
        }

        porcentagemIdade16 = (double) totalMenos16 / pessoas.length * 100;

        System.out.printf("Altura média: %.2f\n", somaTodasAlturas/pessoas.length);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemIdade16);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }


        sc.close();
    }

}