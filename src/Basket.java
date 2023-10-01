import java.util.Arrays;

public class Basket {
    Product[] boughtProduct;



    public Basket(Product[] boughtProduct) {
        this.boughtProduct = boughtProduct;
    }

    public Product[] getBoughtProduct() {
        return boughtProduct;
    }

    public void setBoughtProduct(Product[] boughtProduct) {
        this.boughtProduct = boughtProduct;
    }
}
