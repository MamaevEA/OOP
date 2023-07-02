package OOP_Lesson_1.HW_1.HW_1;

public class Product {
    private String name;
    private int price;
    private int rating;

    public Product(String n, int a, int m) {
        this.name = n;
        this.price = a;
        this.rating = m;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {this.name = name;}
    public int getAge() {
        return this.price;
    }
    public void setPrice(int price) {this.price = price;}
    public int isMale() {
        return this.rating;
    }
    public void setRating(int rating) {this.rating = rating;}
}


