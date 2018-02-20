/*
1.1.3. Дано целое число а и натуральное (целое неотрицательное) число n . Вычислите a^n .
Другими словами, необходимо составить программу, при исполнении которой значения переменных а и n не меняются,
а значение некоторой другой переменной (например, b ) становится равным an .
(При этом разрешается использовать и другие переменные.)

Решение. Введём целую переменную k , которая меняется от 0 до n ,
причём поддерживается такое свойство: b = ak ).
k := 0; b := 1;
{b = a в степени k}
while k <> n do begin
k := k + 1;
b := b * a;
end;

Другое решение той же задачи:
k := n; b := 1;
{a в степени n = b * (a в степени k)}
while k <> 0 do begin
k := k - 1;
b := b * a;
end;

 */
package p1_values;

import utils.MathUtils;

import static utils.IO_Utils.inputInt;
import static utils.IO_Utils.inputPositiveInt;

public class Item_1_2 {

    public static void main(String[] args) {
        System.out.print("a=");
        int a = inputInt();
        System.out.print("n=");
        int n = inputPositiveInt();

        int k = 0;
        int b = 1;

        try {
            while (k++ < n) {
                b = MathUtils.safeMultiply(b, a);
            }
        } catch (Exception e) {
            e.printStackTrace();
            b = -1;
        }

        System.out.println(a + "^" + n + " = " + b);
    }
}
