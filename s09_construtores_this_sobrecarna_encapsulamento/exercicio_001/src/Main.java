import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numConta;
        String nome;
        double deposito = 0.00;
        double saque = 0.00;
        String depositoInicial;

        System.out.println("Enter account number: ");
        numConta = sc.nextInt();

        // Consumir a quebra de linha pendente no buffer;
        sc.nextLine();

        System.out.println("Enter account holder: ");
        nome = sc.nextLine();
        //Até aqui funcionando corretamente

        System.out.println("Is there na inicial deposit (y/n)");
        depositoInicial = sc.nextLine();

        if (depositoInicial.equalsIgnoreCase("y")) {
            System.out.println("Enter Inicial deposit: ");
            deposito = sc.nextDouble();
        } else if (depositoInicial.equalsIgnoreCase("n")) {
            deposito = 0.00;
        }else{
            System.out.println("Inválido");
        }

        ContaBancaria conta1 = new ContaBancaria(numConta, nome, deposito);
        conta1.setValorDeposito(deposito);
        System.out.println("Account data:");
        System.out.println(conta1);

        System.out.println("Enter a deposit value: ");
        deposito = sc.nextDouble();
        conta1.setValorDeposito(deposito);
        System.out.println("Updated account data:");
        System.out.println(conta1);

        System.out.println("Enter a withdraw value: ");
        saque = sc.nextDouble();
        conta1.setSaque(saque);
        System.out.println("Updated account data: ");
        System.out.println(conta1);



        sc.close();
    }
}