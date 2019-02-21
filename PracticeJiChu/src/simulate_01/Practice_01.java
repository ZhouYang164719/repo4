package simulate_01;

import java.util.Scanner;

public class Practice_01 {
    /*    键盘一个大于100的整数，打印1-该数字之间(包括1和该数字)能同时被3和5整除的数字及数字的个数，
        要求：每行打印5个满足条件的数字，数字之间使用空格进行分隔*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于100的整数");
        int a = sc.nextInt();

        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                counter++;
                if (counter % 5 == 0) {
                    System.out.println(i);
                }else {
                    System.out.print(i+"\t");
                }
            }
        }
    }
}
