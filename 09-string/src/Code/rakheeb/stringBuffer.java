package Code.rakheeb;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

//string buffer are mutable
//they are more efficient
//thread safe

public class stringBuffer {
    static void main(String[] args) {
        //constructor 1
        //Empty buffer default value 16
        StringBuffer sb = new StringBuffer();

        //constructor 2
        //Initialize with the string
        StringBuffer sb2 = new StringBuffer("hello");

        //constructor 3
        //Empty buffer with given capacity
        StringBuffer sb3 = new StringBuffer(30);

        //methods
        sb.append("hello rakheeb");
        System.out.println(sb);

        sb2.insert(0,9);
        System.out.println(sb2);

        sb.replace(0,13,"hello ashu");
        System.out.println(sb);

        sb2.delete(0,3);
        System.out.println(sb2);

        sb.reverse();
        System.out.println(sb);

        sb2.capacity();
        System.out.println(sb2);

        sb3.length();
        System.out.println(sb3);

        sb.charAt(4);
        System.out.println(sb);

        sb2.setCharAt(0,'y');


        //create a random variable
        Random random=new Random();
        System.out.println(random.nextFloat());
        System.out.println(random.doubles());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextInt());
        System.out.println(random.nextLong());


        //removing white spaces
        String sentences="ab cd efg hij  klmn  op  grstu  vw  xyz";
        System.out.println(sentences);

        System.out.println(sentences.replaceAll("\\s",""));


        //split
        String name="shaikh abdul rakheeb";
        String[]arr=name.split("");
        String[]arr2=name.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        //rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }
}
