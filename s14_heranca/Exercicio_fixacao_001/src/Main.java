import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> listProducts = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        Product p;

        for (int i = 0; i < n; i++){
            System.out.println("Product #"+ (i+1)+ " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(productType == 'c'){
                p = new Product(name, price);
               listProducts.add(p);
            }else if(productType == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                p = new UsedProduct(name, price, manufactureDate);
                listProducts.add(p);
            }else if(productType == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                p = new ImportedProduct(name, price, customsFee);
                listProducts.add(p);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product product : listProducts){
            System.out.println(product.priceTag());
        }


        //Product pdc1 = new Product("Notebook ", 1100.00);
        //Product pdc2 = new ImportedProduct("Tablet", 260.00, 20.00);


        sc.close();

    }
}