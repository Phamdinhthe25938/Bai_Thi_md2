package Controller;

import modal.Product;

public interface InterfaceManager {

    Product creatProduct();
    void displayProductList();
    void addProduct();

    void editProduct();

    void deleteProduct();

    void sortProudUctByPrice();

    void findProductPriceMax();

    void writeFileProductList();
    void readFileProductList();

}
