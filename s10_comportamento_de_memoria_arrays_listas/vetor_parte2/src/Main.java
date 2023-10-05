import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];
        double soma = 0;

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);

            soma += vect[i].getPrice();

        }

        System.out.printf("Media: %.2f", soma/n);

        sc.close();
    }
}