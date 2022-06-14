package Validate;

import modal.Product;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateProduct {
    Scanner sc = new Scanner(System.in);

    public int checkCodeProductExist(ArrayList<Product> products,int codeProduct){
        for(int i=0;i<products.size();i++){
            if(products.get(i).getCodeProduct()==codeProduct){
                return i;
            }
        }
        return -1;
    }
    public int validateCodeProduct(ArrayList<Product> products){
            while (true){
                try{
                    int codeProduct = Integer.parseInt(sc.nextLine());
                    if(checkCodeProductExist(products,codeProduct)>=0){
                        System.out.println("Mã sản phẩm đã tồn tại vui lòng nhập mã sản phẩm khác !");
                    }
                    else {
                        return codeProduct;
                    }
                }
                catch (NumberFormatException e){
                    System.out.println("Mã sản phẩm k được định dạng ký tự số ! Vui lòng nhập lại !");
                }
            }
    }
    public String validateNameAndDescribeProduct(String name){
        final String stringRegex= "[\\w]";
        while (true){
            String nameProduct= sc.nextLine();
            Pattern p = Pattern.compile(stringRegex);
            Matcher m = p.matcher(nameProduct);
           if(nameProduct.length()!=0){
               if(m.matches()){
                   return nameProduct;
               }
               else {
                   System.out.println(name+" sản phẩm không được có ký tự đặc biệt !Vui lòng nhập lại :");
               }
           }else {
               System.out.println(name+" sản phẩm k đc để trống !Vui lòng nhập lại: ");
           }
        }
    }
    public double validatePriceProduct(){
        while (true){
           try {
               System.out.println("Nhập giá của sản phẩm :");
               double priceProduct = Double.parseDouble(sc.nextLine());
               if(priceProduct>0){
                   return priceProduct;
               }else {
                   System.out.println("Gía sản phẩm không hợp lê !");
               }
           }
           catch (NumberFormatException e){
               System.out.println("Gía sản phẩm không đúng định dạng!");
           }
        }
    }
    public int validateQuantityProduct(){
        while (true){
            try {
                System.out.println("Nhập số lượng của  sản phẩm : ");
                int quantityProduct= Integer.parseInt(sc.nextLine());
                if(quantityProduct>0){
                    return quantityProduct;
                }
                else {
                    System.out.println("Số lượng sản phẩm không hợp lê !");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Số lượng sản phẩm không đúng định dạng  !");
            }
        }
    }
}
