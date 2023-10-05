import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth data (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        sc.nextLine();

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Client c1 = new Client(nome, email, birthDate);

        System.out.print("How many items to this order? ");
        int qtdOrder = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), c1, OrderStatus.valueOf(status));


        for(int i = 0; i < qtdOrder; i++){
            System.out.println("Enter #"+ (i+1) + " iem data:");
            System.out.print("Product name: ");
            String procuctName = sc.nextLine();

            System.out.print("Product price: ");
            double procuctPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            sc.nextLine();
            Product product = new Product(procuctName, procuctPrice);
            OrderItem orderItem = new OrderItem(quantity, product);
            //order = new Order(new Date(), c1,  OrderStatus.valueOf(status));

            order.addItem((orderItem));
        }

        System.out.println();

        System.out.println(order);


        sc.close();
    }
}