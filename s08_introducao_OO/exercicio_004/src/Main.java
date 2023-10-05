// Faça um program para ler a cotação do dóla, e depois um valor em dolares a ser
// comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar
// pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor
// em dolar. Criar uma classe CurrencyConveter

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double valorDolar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double valorReais = sc.nextDouble();


        double cotacao = CurrencyConverter.dolar(valorDolar, valorReais);

        System.out.printf("Amount to be paid in reais = %.2f", cotacao);

        sc.close();

    }
}