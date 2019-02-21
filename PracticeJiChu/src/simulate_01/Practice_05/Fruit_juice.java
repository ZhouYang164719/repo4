package simulate_01.Practice_05;

public class Fruit_juice extends Drink {
    @Override
    public void mark(int sweetInt) {
        switch (sweetInt) {
            case 1:
                super.setSweetness("无糖");
                System.out.println("甜度:"+super.getSweetness());
                break;
            case 2:
                super.setSweetness("半糖");
                System.out.println("甜度:"+super.getSweetness());
                break;
            case 3:
                super.setSweetness("七分糖");
                System.out.println("甜度:"+super.getSweetness());
                break;
            case 4:
                super.setSweetness("全糖");
                System.out.println("甜度:"+super.getSweetness());
                break;
            default:
                super.setSweetness("输入有误");
                System.out.println("甜度:"+super.getSweetness());
                break;
        }
    }
}
