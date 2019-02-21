package simulate_01.Practice_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student one = new Student(66.66,18);
        Student two = new Student(70,19);
        Student three = new Student(71.5,20);
        Student four = new Student(72.5,30);
        Student five = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        five.setScore(sc.nextDouble());

        System.out.println("请输入学生年纪");
        five.setAge(sc.nextInt());

        ArrayList<Student> list1= new ArrayList<>();
        list1.add(one);
        list1.add(two);
        list1.add(three);
        list1.add(four);
        list1.add(five);

        ArrayList<Student> list2= new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list1.get(i).show();
            Check newOne = new Check();
            newOne.getScore(list1.get(i));
            list2.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            list2.get(i).show();
        }


    }
}
