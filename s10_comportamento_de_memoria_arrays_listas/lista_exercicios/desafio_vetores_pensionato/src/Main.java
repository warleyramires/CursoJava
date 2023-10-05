import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Estudante[] estudantes = new Estudante[10];
        String nome;
        String email;
        int quarto;

        System.out.println("How many rooms will be rented?");
        int qtdQuartos = sc.nextInt();

        sc.nextLine();
        for(int i = 0; i < qtdQuartos;i++){
            System.out.println("Rent #" + (i+1));
            System.out.println("Name: ");
            nome = sc.nextLine();
            System.out.println("Email: ");
            email = sc.nextLine();
            System.out.println("Room: ");
            quarto = sc.nextInt();
            sc.nextLine();

            estudantes[quarto] = new Estudante(nome, email, quarto);

        }

        System.out.println("Busy rooms");
        for(int i = 0; i < estudantes.length; i++){
            if(estudantes[i] != null){
                System.out.println(i + ": " + estudantes[i].getNome() + ", " + estudantes[i].getEmail());
            }
        }


        sc.close();

    }
}