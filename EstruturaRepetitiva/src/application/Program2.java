package EstruturaRepetitiva.src.application;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X,Y;
        X = sc.nextInt();
        Y = sc.nextInt();

        while (X != 0 && Y != 0){

            if(X > 0 && Y > 0){
                System.out.println("primeiro");
                X = sc.nextInt();
                Y = sc.nextInt();
            } else if (X > 0 && Y < 0) {
                System.out.print("quarto");
                X = sc.nextInt();
                Y = sc.nextInt();
            }else if(X < 0  && Y < 0){
                System.out.print("terceiro");
                X = sc.nextInt();
                Y = sc.nextInt();
            }else if(X < 0 && Y > 0){
                System.out.print("segundo");
                X = sc.nextInt();
                Y = sc.nextInt();
            }else {
                System.out.println(" ");
                X = sc.nextInt();
                Y = sc.nextInt();
            }

        }


        sc.close();
    }
}
