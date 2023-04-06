package lesson4_1;

public class Main {
    public static void main(String[] args) {
        Numeric<Integer> ob = new Numeric<>(5);

        System.out.println("Обратная велечина ob " + ob.getNum());
        System.out.println("Дробная часть ob " + ob.getNum2());

        Numeric<Double> ob2 = new Numeric<>(5.6);

        System.out.println("Обратная велечина ob " + ob2.getNum());
        System.out.println("Дробная часть ob " + ob2.getNum2());

    //    Numeric<String> ob3 = new Numeric<String>("sadas");
    }
}
