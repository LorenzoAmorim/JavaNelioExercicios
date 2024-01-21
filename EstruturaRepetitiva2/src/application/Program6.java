package EstruturaRepetitiva2.src.application;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int divisores = 0;
        for(int i = 1; i<n; i++){
            divisores = n/i;
            if(n % i == 0){
                System.out.println(divisores);
            }
        }
        sc.close();
    }
}
