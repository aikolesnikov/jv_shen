// https://wiki.sei.cmu.edu/confluence/display/java/NUM00-J.+Detect+or+prevent+integer+overflow

package p1_values;

import utils.MathUtils;
import static utils.IO_Utils.inputInt;

public class Item1_1 {


    public static void main(String[] args) {

        System.out.println("maxInt = " + Integer.MAX_VALUE);
        System.out.println();

        System.out.print("a=");
        int a = inputInt();
        System.out.print("b=");
        int b = inputInt();

        try {
            a = Math.addExact(a, b);
            // a = MathUtils.safeAdd(a, b);
            b = MathUtils.safeSubtract(a, b);
            a = MathUtils.safeSubtract(a, b);
        } catch (Exception e) {
            // e.printStackTrace();
            int c = a;
            a = b;
            b = c;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
