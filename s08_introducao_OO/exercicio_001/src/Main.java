// Fazer um programa pra ler os valores da largura e a altura
// de um retangulo. Em seguida, mostrar na tela o valor de sua area,
// perimetro e diagonal. Usar uma classe como mostrado no projeto ao lado

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, perimeter, diagonal;
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);
    }
}