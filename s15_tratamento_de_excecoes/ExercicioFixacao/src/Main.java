import model.entities.Account;
import model.exceptions.BusinessException;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();

            try {
                acc.withdraw(withdraw);

                System.out.println("New balance: " + String.format("%.2f",acc.getBalance()));
            }catch (BusinessException e){
                System.out.println(e.getMessage());
            }


        sc.close();
    }
}