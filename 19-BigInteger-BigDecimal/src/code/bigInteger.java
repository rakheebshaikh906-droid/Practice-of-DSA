package code;

import java.math.BigInteger;

public class bigInteger {
    static void main() {

        //for integer number
        BigInteger a = BigInteger.valueOf(4384738);
        BigInteger b = BigInteger.valueOf(8721846);

        // for string number
        BigInteger c = new BigInteger("8329846384628469846876");
        BigInteger d = new BigInteger("9821986129836127861876");

        //methods
        BigInteger s = a.add(b);
        System.out.println(s);

        BigInteger m = c.multiply(d);
        System.out.println(m);

        BigInteger sub = c.subtract(d);
        System.out.println(sub);

        BigInteger div = c.divide(d);
        System.out.println(div);

        BigInteger rem = c.remainder(d);
        System.out.println(rem);

        if(c.compareTo(d)<0){
            System.out.println("yes");
        }

        if(b.compareTo(a)>0){
            System.out.println("yes");
        }

    }
}
