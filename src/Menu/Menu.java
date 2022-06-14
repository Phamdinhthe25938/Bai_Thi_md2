package Menu;

import Controller.ManagerProduct;

import java.util.Scanner;

public class Menu {

          ManagerProduct managerProduct = new ManagerProduct();

          Scanner scanner = new Scanner(System.in);

    public void menu(){
        while (true){
            System.out.println("----Menu-----");
            System.out.println("1.Hiện thi danh sách sản phẩm !");
            System.out.println("2.Thêm sản phẩm mới !");
            System.out.println("3.Chỉnh sửa sản phẩm !");
            System.out.println("4.Xóa sản phẩm !");
            System.out.println("5.Sắp xếp sản phẩm theo giá tăng dần!");
            System.out.println("6.Hiện thị sản phẩm có giá đắt nhất !");
            System.out.println("7.Ghi file sản phẩm !");
            System.out.println("9.Đọc file sản phẩm !");
            try {
                System.out.println("Nhập lựa chon :");
                int choice= Integer.parseInt(scanner.next());
                switch (choice){
                    case 1:
                        managerProduct.displayProductList();
                        break;
                    case 2:
                        managerProduct.addProduct();
                        break;
                    case 3:
                        managerProduct.editProduct();
                        break;
                    case 4:
                        managerProduct.deleteProduct();
                        break;
                    case 5:
                        managerProduct.sortProudUctByPrice();
                        break;
                    case 6:
                        managerProduct.findProductPriceMax();
                        break;
                    case 7:
                        managerProduct.writeFileProductList();
                        break;
                    case 8:
                        managerProduct.readFileProductList();
                        break;
                }
                if(choice<0 || choice>8){
                    System.out.println("Nhập quá chỉ số lựa chọn ! Vui lòng nhập lại");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Nhập k đúng định dạng vui lòng nhập lại !");
            }
        }
    }
}
