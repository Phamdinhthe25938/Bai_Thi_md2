package IO;

import modal.Product;

import java.io.*;
import java.util.ArrayList;

public class WriteAndRead {
    File file = new File("Product.csv");
    public void write(ArrayList<Product> products){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Code product,Name Product,Price Product, Quantity Product,Describe product");
            bufferedWriter.newLine();
            for (Product s : products) {
                bufferedWriter.write(s.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("File not data");
        }
    }
    public ArrayList<Product> reader(){
        ArrayList<Product> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str ;
            while ((str = bufferedReader.readLine()) != null) {
                String[] arr = str.split(",");
                int codeProduct = Integer.parseInt(arr[0]);
                String nameProduct = arr[1];
                double priceProduct = Double.parseDouble(arr[2]);
                int quantityProduct = Integer.parseInt(arr[3]);
                String describeProduct = arr[4];
                students.add(new Product(codeProduct,nameProduct,priceProduct,quantityProduct,describeProduct));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("File not data");
        }
        return students;
    }
}
