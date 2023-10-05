//Leia a hora inicial e a hora final de um jogo. A seguir
// calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma
// duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora1, hora2, duracao;

        hora1 = sc.nextInt();
        hora2 = sc.nextInt();

        if(hora1 < hora2){
            duracao = hora2 - hora1;
        }else {
            duracao = 24 - hora1 + hora2;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORAS(S)");


        sc.close();
    }
}