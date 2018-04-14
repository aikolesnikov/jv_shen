// 1.1.8. Дано натуральное n , вычислите n ! ( 0 ! = 1 , n ! = n · ( n − 1 )!).

package p1_values;

import utils.MathUtils;

import static utils.IO_Utils.inputInt;

public class Item_1_8 {

    static private int fact(int n) {

        int res = -1;

        try {
            if ((n == 0) || (n == 1)) {
                res = 1;
                return 1;
            } else {
                res = MathUtils.safeMultiply(n, fact(n - 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    public static void main(String[] args) {

        int a = inputInt();

        int b = fact(a);

        if (b > 0) {
            System.out.println(fact(a));
        } else {
            System.out.println(-1);
        }
    }
}
