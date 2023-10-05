import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma
// mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os
// valores lidos são múltiplos entre si. Atenção: os números devem
// poder ser digitados em ordem crescente ou decrescente.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}