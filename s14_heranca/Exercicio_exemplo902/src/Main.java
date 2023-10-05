import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Employee> list = new ArrayList<Employee>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        //sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Employee #"+ (i+1) + " data:");
            System.out.println("outsourced (y/n) ");
            sc.nextLine();
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valuePerHours = sc.nextDouble();

            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
                list.add(emp);
            }else if(ch == 'n'){
                Employee emp = new Employee(name, hours, valuePerHours);
                list.add(emp);
            }else {
                System.out.println("Invalid value entered. Try again!");
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ "+ String.format("%.2f", emp.payment()));
        }



    sc.close();
    }
}