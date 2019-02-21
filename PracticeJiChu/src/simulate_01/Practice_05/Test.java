package simulate_01.Practice_05;

public class Test {
    public static void main(String[] args) {
        Coffee one = new Coffee();
        Fruit_juice two = new Fruit_juice();

        Liquor_store three = new Liquor_store();
        three.process(one);

        three.process(two);
    }
}
