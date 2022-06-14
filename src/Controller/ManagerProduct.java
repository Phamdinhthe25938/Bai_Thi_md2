package Controller;

import IO.WriteAndRead;
import SortObject.SortProductByPrice;
import Validate.ValidateProduct;
import modal.Product;

import java.util.ArrayList;

public class ManagerProduct implements InterfaceManager {

    ValidateProduct validateProduct = new ValidateProduct();

    ArrayList<Product> products = new ArrayList<>();

    WriteAndRead writeAndRead = new WriteAndRead();
    @Override
    public Product creatProduct() {
        System.out.println("Nhập mã sản phẩm : ");
        int codeProduct = validateProduct.validateCodeProduct(products);

        System.out.println("Nhập tên của sản phẩm : ");
        String nameProduct= validateProduct.validateNameAndDescribeProduct("Tên");

        double priceProduct = validateProduct.validatePriceProduct();

        int quantityProduct = validateProduct.validateQuantityProduct();

        String describeProduct= validateProduct.validateNameAndDescribeProduct("Mô tả");

        return new Product(codeProduct,nameProduct,priceProduct,quantityProduct,describeProduct);
    }
    @Override
    public void displayProductList(){
         if(products.size()==0){
             System.out.println("Danh sách sản phẩm chưa có!");
         }
         else {
             for (Product p: products){
                 System.out.println(p);
             }
        }
    }
    @Override
    public void addProduct() {
        products.add(creatProduct());
    }

    @Override
    public void editProduct() {
        System.out.println("Nhập mã sản phẩm bạn muốn sửa :");
        int codeProductEdit = validateProduct.validateCodeProduct(products);
        int vtProductEdit =  validateProduct.checkCodeProductExist(products,codeProductEdit);
        products.set(vtProductEdit,creatProduct());
    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập mã sản phẩm muốn xóa :");
        int codeProductDelete = validateProduct.validateCodeProduct(products);
        int vtProductDelete =  validateProduct.checkCodeProductExist(products,codeProductDelete);
        products.remove(vtProductDelete);
    }


    @Override
    public void sortProudUctByPrice() {
           products.sort(new SortProductByPrice());
    }

    @Override
    public void findProductPriceMax() {
        double maxPrice = products.get(0).getPriceProduct();
        for (int i=1;i<products.size();i++){
            if(products.get(i).getPriceProduct()>maxPrice){
                maxPrice = products.get(i).getPriceProduct();
            }
        }
        for (int i=0;i<products.size();i++){
            if(products.get(i).getPriceProduct()==maxPrice){
                System.out.println(products.get(i));
            }
        }
    }

    @Override
    public void writeFileProductList() {
        writeAndRead.write(products);
    }

    @Override
    public void readFileProductList() {
            writeAndRead.reader();
    }

}
