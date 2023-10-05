//Fazer um programa que leia o número de um funcionário, seu número de
// horas trabalhadas, o valor que recebe por hora e calcula o salário desse
// funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner codFuncionario = new Scanner(System.in);
        Scanner inputHoras = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Scanner inputValor = new Scanner(System.in);

        int cod = codFuncionario.nextInt();
        int horas = inputHoras.nextInt();
        double valor = inputValor.nextDouble();
        double salario = horas * valor;

        System.out.println("NUMBER = " + cod);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}