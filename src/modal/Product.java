package modal;

public class Product {
    private int codeProduct;

    private String nameProduct;

    private double priceProduct;

    private int quantityProduct;

    private String describeProduct;

    public Product() {
    }

    public Product(int codeProduct, String nameProduct, double priceProduct, int quantityProduct, String describeProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.quantityProduct = quantityProduct;
        this.describeProduct = describeProduct;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    @Override
    public String toString() {
        return "CodeProduct : " + codeProduct +
                ", nameProduct : " + nameProduct +
                ", priceProduct : " + priceProduct +
                ", quantityProduct : " + quantityProduct +
                ", describeProduct : " + describeProduct ;
    }
    public String write(){
        return  codeProduct + ","+ nameProduct + ","+ priceProduct+ ","+ quantityProduct+ ","+ describeProduct;
    }
}
