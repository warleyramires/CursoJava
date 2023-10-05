// Fazer um programa para ler os dados de um funcionario
// (nome, salário bruno e imposto). Em seguida, mostrar os
// dados  do funcionario(nome e salario liquido). Em seguida
// aumentar o salario do funcionario com base em uma porcentagem
// dada(somente o salario bruno é afetado pela porcentagem) e
// mostrar novamente dados do funcionario. Use a classe
// projetada abaixo.


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.println("Name: ");
        funcionario.name = sc.nextLine();

        System.out.println("Gross salary");
        funcionario.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println(funcionario);

        System.out.println("Which percentage to increase salary? ");
        double pertentage = sc.nextDouble();

        funcionario.increaseSalary(pertentage);


        sc.close();
    }
}