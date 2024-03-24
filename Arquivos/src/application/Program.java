package Arquivos.src.application;

import Arquivos.src.application.entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        String sourceFolder = path.getParent();

        boolean success = new File(sourceFolder, "\\out").mkdir();
        String newFile = sourceFolder + "\\out\\summary.csv";

//        System.out.println("PASTA CRIADA: " + success);
//        System.out.println("ARQUIVO CRIADO: " + newFile);

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {

                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(newFile + "CREATED");

            } catch (IOException f) {
                System.out.println("Error writing file " + f.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file " + e.getMessage());
        }


//        System.out.println("CAMINHOS:");
//        System.out.println("APENAS O NOME DO ARQUIVO: " + path.getName());
//        System.out.println("CAMINHO SEM O NOME DO ARQUIVO: " + path.getParent());
//        System.out.println("CAMINHO COM O NOME DO ARQUIVO: " + path.getPath());

        sc.close();
    }
}
