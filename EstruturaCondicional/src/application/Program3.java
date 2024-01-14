package EstruturaCondicional.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double preco;
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if(codigo == 1){
           preco = 4.00 * quantidade;
        }else if(codigo ==2){
            preco = 4.50 * quantidade;
        }else if(codigo ==3){
            preco = 5.00 * quantidade;
        }else if(codigo ==4){
            preco = 2.00 * quantidade;
        }else {
            preco = 1.50 * quantidade;
        }

        System.out.println("TOTAL: R$" + preco);

        sc.close();
    }
}
