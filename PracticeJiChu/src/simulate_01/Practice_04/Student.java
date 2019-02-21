package simulate_01.Practice_04;

public class Student extends  Check{
    private double score;
    private int age;

    public Student() {
    }

    public Student(double score, int age) {
        this.score = score;
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show (){
        System.out.println(this.getScore()+"---"+this.getAge());
    }
}
