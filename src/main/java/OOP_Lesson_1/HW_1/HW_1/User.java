package OOP_Lesson_1.HW_1.HW_1;

public class User {
    private String  Login;
    private String Pass;
    private Basket Basket;

    public User(String login, String pass) {
        this.Login = login;
        this.Pass = pass;
        this.Basket = new Basket();
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        this.Login = login;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        this.Pass = pass;
    }

    public OOP_Lesson_1.HW_1.HW_1.Basket getBasket() {
        return Basket;
    }

}
