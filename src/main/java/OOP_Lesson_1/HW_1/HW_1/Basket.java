package OOP_Lesson_1.HW_1.HW_1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> buyProducts;
    public Basket() {this.buyProducts = new ArrayList<>();}

    public List<Product> getBuyProducts() {
        return buyProducts;
    }
    public void setBuyProducts(List<Product> buyProducts) {
        this.buyProducts = buyProducts;
    }
    public void addBuyProducts (Product product) {
        buyProducts.add(product);
    }
    public void dellBuyProducts (Product product) {
        buyProducts.remove(product);
    }
}
