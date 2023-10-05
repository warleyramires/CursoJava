import Entities.Fisica;
import Entities.Juridica;
import Entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> listPessoa = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #"+(i+1)+" data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double heathExpenditures = sc.nextDouble();
                listPessoa.add(new Fisica(name, anualIncome, heathExpenditures));
            }else{
                System.out.print("Number of Employees: ");
                int numberEmployees = sc.nextInt();
                listPessoa.add(new Juridica(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();
        System.out.print("TAXES PAID:");

        double totalTaxes = 0;
        for(Pessoa p : listPessoa){

            System.out.println(p.getNome() + ": $ "+ String.format("%.2f", p.calcImposto()));
            totalTaxes += p.calcImposto();
        }
        System.out.println();
        System.out.print("TOTAL TAXES: $ "+ String.format("%.2f", totalTaxes));

    }
}