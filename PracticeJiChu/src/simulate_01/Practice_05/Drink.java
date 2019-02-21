package simulate_01.Practice_05;

public abstract class Drink {
    private String sweetness;

    public Drink(String sweetness) {

        this.sweetness = sweetness;
    }

    public Drink() {
    }

    public String getSweetness() {

        return sweetness;
    }

    public void setSweetness(String sweetness) {

        this.sweetness = sweetness;
    }

    public abstract void mark(int sweetInt);
}
