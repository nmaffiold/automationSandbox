package Models.Product;

/**
 * Created by nicolasmaffiold on 23/6/17.
 */
public class CompareByTitle implements CompareStrategy {

    private String Title;

    public CompareByTitle(String name){
        this.Title=name;
    }

    public boolean compareProduct(Product product) {
        return product.getTitle().equalsIgnoreCase(Title);
    }
}
