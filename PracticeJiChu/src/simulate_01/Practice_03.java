package simulate_01;

import java.util.ArrayList;
import java.util.Random;

public class Practice_03 {
    /*    （1）定义一个数组，存储大写字符，小写字符及数字字符
    （2）从数组中随机获取10个字符（不考虑是否重复）组成字符串，并将10个用该方式获取的字符串存储到集合中
    （3）将集合内的字符串进行打印输出，格式如下：
        第1个字符串:......
        第2个字符串:......
                。。。*/
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();

        char[] ch = new char[62];
        for (int i = 48,j=0; i < 58; i++,j++) {
            ch[j] =(char)i;
        }

        for (int i = 65,j=10; i < 91; i++,j++) {
            ch[j] =(char)i;
        }

        for (int i = 97,j=36; i < 123; i++,j++) {
            ch[j] =(char)i;
        }

        for (int i = 0; i < 10; i++) {
            String st = "";
            for (int j = 0; j < 10; j++) {
                st+=ch[r.nextInt(62)];
            }
            list.add(st);
        }

        System.out.println(list);

    }
}
