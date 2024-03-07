package HerancasEPolimorfismo.src.application;

import HerancasEPolimorfismo.src.entities.ImportedProduct;
import HerancasEPolimorfismo.src.entities.Product;
import HerancasEPolimorfismo.src.entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)?");
            char state = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(state == 'c'){
                list.add(new Product(name, price));

            } else if (state == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY):");
                LocalDate localDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, localDate));

            } else if (state == 'i') {
                System.out.print("Customs fee: ");
                Double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product product : list){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
