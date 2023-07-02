package OOP_Lesson_1.HW_1.HW_1;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Категория 1");
        Category category2 = new Category("Категория 2");

        Product product1 = new Product("Товар 1", 100, 5);
        Product product2 = new Product("Товар 2", 200, 4);
        Product product3 = new Product("Товар 3", 300, 3);
        Product product4 = new Product("Товар 4", 400, 2);

        category1.addProduct(product1);
        category1.addProduct(product2);
        category2.addProduct(product3);
        category2.addProduct(product4);

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        user1.getBasket().addBuyProducts(product1);
        user1.getBasket().addBuyProducts(product3);

        user2.getBasket().addBuyProducts(product2);
        user2.getBasket().addBuyProducts(product4);

        System.out.println("Каталог продуктов:");
        System.out.println(category1.getName());
        for (Product product : category1.getProducts()) {
            System.out.println("  - " + product.getName());
        }

        System.out.println(category2.getName());
        for (Product product : category2.getProducts()) {
            System.out.println("  - " + product.getName());
        }

        System.out.println("\nПокупки пользователей:");
        System.out.println(user1.getLogin());
        for (Product product : user1.getBasket().getBuyProducts()) {
            System.out.println("  - " + product.getName());
        }

        System.out.println(user2.getLogin());
        for (Product product : user2.getBasket().getBuyProducts()) {
            System.out.println("  - " + product.getName());
        }
    }
}
