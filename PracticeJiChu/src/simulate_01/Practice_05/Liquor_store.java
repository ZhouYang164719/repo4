package simulate_01.Practice_05;

import java.util.Scanner;

public class Liquor_store {
    public void process(Drink drink){
        if(drink instanceof Coffee){
            Scanner sc = new Scanner(System.in);

            System.out.println("请选择甜度:");
            System.out.println("1 无糖");
            System.out.println("2 半糖");
            System.out.println("3 七分糖");
            System.out.println("4 全糖");
            int sweet = sc.nextInt();

            System.out.println("请选择加奶:");
            System.out.println("1 奶泡");
            System.out.println("2 奶油");
            System.out.println("3 半奶");
            int addMilk = sc.nextInt();

            Coffee one = (Coffee) drink;
            one.add_Milk(addMilk);
            one.mark(sweet);
        }

        if(drink instanceof Fruit_juice){
            Scanner sc = new Scanner(System.in);

            System.out.println("请选择甜度:");
            System.out.println("1 无糖");
            System.out.println("2 半糖");
            System.out.println("3 七分糖");
            System.out.println("4 全糖");
            int sweet = sc.nextInt();

            Fruit_juice one = (Fruit_juice) drink;
            one.mark(sweet);
        }
    }
}
