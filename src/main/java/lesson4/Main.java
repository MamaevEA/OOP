package lesson4;

public class Main {
    public static void main(String[] args) {
       Gen<Integer, String> ob = new Gen<Integer, String>(88, "test");
       ob.showType();



       System.out.println(ob.getOb());
       System.out.println(ob.getOb2());

    }
}
