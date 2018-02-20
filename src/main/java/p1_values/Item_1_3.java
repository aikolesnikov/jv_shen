/*
1.1.4. Решите предыдущую задачу, если требуется, чтобы число действий (выполняемых операторов присваивания)
было порядка log n (то есть не превосходило бы C log n для некоторой константы C ; log n |
это степень, в которую нужно возвести 2, чтобы получить n ).

Решение. Внесём некоторые изменения во второе из предложенных решений предыдущей задачи:
k := n; b := 1; c:=a;
{a в степени n = b * (c в степени k)}
while k <> 0 do begin
if k mod 2 = 0 then begin
k:= k div 2;
c:= c*c;
end
else begin
k := k - 1;
b := b * c;
end;
end;
 */
package p1_values;

import utils.MathUtils;

import static utils.IO_Utils.inputInt;
import static utils.IO_Utils.inputPositiveInt;

public class Item_1_3 {

    public static void main(String[] args) {
        System.out.print("a=");
        int a = inputInt();
        System.out.print("n=");
        int n = inputPositiveInt();

        int k = n;
        int b = 1;
        int c = a;

        try {
            while (k != 0) {
                if (k % 2 == 0) {
                    k /= 2;
                    c = MathUtils.safeMultiply(c, c);
                } else {
                    k -= 1;
                    b = MathUtils.safeMultiply(b, c);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            b = -1;
        }

        System.out.println(a + "^" + n + " = " + b);
    }

}


