import entities.Departament;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.println("Level: ");
        String workerlevel = sc.nextLine();

        System.out.println("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(departmentName, WorkerLevel.valueOf(workerlevel), baseSalary, new Departament(departmentName));

        System.out.println("How manu contracts to this worker");
        int n = sc.nextInt();

        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHouer = sc.nextDouble();
            System.out.print("Duration (hours)");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHouer, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        sc.close();
    }
}