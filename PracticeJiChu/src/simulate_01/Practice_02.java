package simulate_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_02 {
    /*    定义String类型数组，存储键盘录入的5个字符串，定义方法，传递该数组，方法功能如下：
                （1）将数组中字符串长度为偶数的元素存储到集合1中
    （2）将数组中包含数字字符的字符串存储到集合2中
    （3）打印集合内元素，格式如下：
        长度为偶数的字符串：......
        包含数字的字符串：......*/
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入一个字符");
            arr[i] = sc.next();
        }
        print(arr);
    }

    public static void print(String[] arr) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() % 2 == 0) {
                list1.add(arr[i]);
            }

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) > '0' && arr[i].charAt(j) < '9') {
                    list2.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(list1);
        System.out.println(list2);

    }
}
