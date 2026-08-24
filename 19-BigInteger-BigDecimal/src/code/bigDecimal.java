package code;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class bigDecimal {
    public static void main(String[] args) {

        // using String constructor (BEST PRACTICE)
        BigDecimal a = new BigDecimal("43847.38");
        BigDecimal b = new BigDecimal("87218.46");

        BigDecimal c = new BigDecimal("8329846384628469846.876");
        BigDecimal d = new BigDecimal("9821986129836127861.876");

        // addition
        BigDecimal sum = a.add(b);
        System.out.println("Addition: " + sum);

        // subtraction
        BigDecimal sub = c.subtract(d);
        System.out.println("Subtraction: " + sub);

        // multiplication
        BigDecimal mul = a.multiply(b);
        System.out.println("Multiplication: " + mul);

        // division (scale + rounding mandatory)
        BigDecimal div = c.divide(d, 5, RoundingMode.HALF_UP);
        System.out.println("Division: " + div);

        // remainder
        BigDecimal rem = c.remainder(d);
        System.out.println("Remainder: " + rem);

        // comparison
        if (c.compareTo(d) < 0) {
            System.out.println("c is smaller than d");
        }

        if (b.compareTo(a) > 0) {
            System.out.println("b is greater than a");
        }

        // equals vs compareTo
        BigDecimal x = new BigDecimal("5.0");
        BigDecimal y = new BigDecimal("5.00");

        System.out.println(x.equals(y));           // false
        System.out.println(x.compareTo(y) == 0);   // true
    }
}
