package Models.Product;

/**
 * Created by nicolasmaffiold on 23/6/17.
 */
public class CompareByPrice implements CompareStrategy {

    private double price;

    public CompareByPrice(double price){
        this.price=price;
    }


    public boolean compareProduct(Product product) {
        return product.getPrice()==price;
    }
}
