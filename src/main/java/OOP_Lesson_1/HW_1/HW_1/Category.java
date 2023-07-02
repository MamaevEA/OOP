package OOP_Lesson_1.HW_1.HW_1;

import java.util.ArrayList;
import java.util.List;


public class Category {
    private String name;
    private List<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public List<Product> getProducts() {return products;}
    public void addProduct(Product product) {products.add(product);}
    public void dellProduct(Product product) {products.remove(product);}
}
