package simulate_01.Practice_05;

public class Coffee extends Drink implements With_milk {
    private String add_Milk;

    public Coffee() {
    }

    public Coffee(String sweetness, String add_Milk) {
        super(sweetness);
        this.add_Milk = add_Milk;
    }

    public String getAdd_Milk() {
        return add_Milk;
    }

    public void setAdd_Milk(String add_Milk) {
        this.add_Milk = add_Milk;
    }

    @Override
    public void add_Milk(int milkInt) {
        switch (milkInt){
            case 1:
                this.setAdd_Milk("奶泡");
                break;
            case 2:
                this.setAdd_Milk("奶油");
                break;
            case 3:
                this.setAdd_Milk("半奶");
                break;
            default:
                this.setAdd_Milk("输入有误");
                break;
        }
    }

    @Override
    public void mark(int sweetInt) {
        switch (sweetInt) {
            case 1:
                super.setSweetness("无糖");
                System.out.println("甜度:"+super.getSweetness()+"---加奶:"+this.getAdd_Milk());
                break;
            case 2:
                super.setSweetness("半糖");
                System.out.println("甜度:"+super.getSweetness()+"---加奶:"+this.getAdd_Milk());
                break;
            case 3:
                super.setSweetness("七分糖");
                System.out.println("甜度:"+super.getSweetness()+"---加奶:"+this.getAdd_Milk());
                break;
            case 4:
                super.setSweetness("全糖");
                System.out.println("甜度:"+super.getSweetness()+"---加奶:"+this.getAdd_Milk());
                break;
            default:
                super.setSweetness("输入有误");
                System.out.println("甜度:"+super.getSweetness()+"---加奶:"+this.getAdd_Milk());
                break;
        }
    }
}
