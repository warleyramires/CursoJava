//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double resul, n1, n2;
        n = sc.nextInt();


        for(int i = 0; i < n; i++){

            n1 = sc.nextDouble();
            n2 = sc.nextDouble();

            if(n2 == 0){
                System.out.println("divisao impossivel");
            }else{
               resul = n1 / n2;
                System.out.printf("%.1f\n", resul);
            }

        }


        sc.close();

    }
}