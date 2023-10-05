//Fazer um programa para ler o código de uma peça 1, o
// número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor
// unitário de cada peça 2. Calcule e mostre o valor a ser pago.


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigo1, qtd1, codigo2, qtd2;
        double valorUnidade1, valorUnidade2;

        codigo1 = scanner.nextInt();
        qtd1 = scanner.nextInt();
        valorUnidade1  = scanner.nextDouble();

        codigo2 = scanner.nextInt();
        qtd2 = scanner.nextInt();
        valorUnidade2 = scanner.nextDouble();

        double valorTotal = (qtd1 * valorUnidade1) + (qtd2 * valorUnidade2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}