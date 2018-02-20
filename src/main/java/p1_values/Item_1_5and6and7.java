/*
1.1.5. Даны натуральные числа а , b . Вычислите произведение a · b ,
используя в программе лишь операции + , - , = , <> .
Решение.
k := 0; c := 0;
{инвариант: c = a * k}
while k <> b do begin
k := k + 1;
c := c + a;
end;
{c = a * k и k = b, следовательно, c = a * b}

1.1.6. Даны натуральные числа а и b . Вычислите их сумму а + b .
Используйте операторы присваивания лишь вида
⟨ переменная1 ⟩ := ⟨ переменная2 ⟩ ,
⟨ переменная ⟩ := ⟨ число ⟩ ,
⟨ переменная1 ⟩ := ⟨ переменная2 ⟩ + 1 .
Решение.
...
{инвариант: c = a + k}
...

1.1.7. Дано натуральное (целое неотрицательное) число а и целое
положительное число d . Вычислите частное q и остаток r при делении а
на d , не используя операций div и mod .
Решение. Согласно определению, a = q · d + r , 0 6 r < d .
{a >= 0; d > 0}
r := a; q := 0;
{инвариант: a = q * d + r, 0 <= r}
while not (r < d) do begin
{r >= d}
r := r - d; {r >= 0}
q := q + 1;
end;
 */

package p1_values;

import utils.MathUtils;

public class Item_1_5and6and7 {

    public static void main(String[] args) {
        // System.out.print("a=");
        // int a = inputInt();
        // System.out.print("b=");
        // int b = inputInt();

        int a = -10;
        int b = -15;

        int i = 0;
        int sum = a;
        int mul = 0;

        try {
            while (i++ < Math.abs(b)) {
                sum = (b > 0) ? MathUtils.safeAdd(sum, 1) : MathUtils.safeSubtract(sum, 1);
                mul = MathUtils.safeAdd(mul, a);
            }
            mul = ((a > 0 && b > 0) || (a < 0 && b < 0 && mul > 0)) ? mul : -mul;
        } catch (Exception e) {
            e.printStackTrace();
            b = -1;
        }

        try {
            assert (sum == -25);
            assert (mul == 150);
        } catch (AssertionError ae) {
            ae.printStackTrace();
        }

        System.out.println(a + "*" + b + " = " + mul);
        System.out.println(a + "+" + b + " = " + sum);
    }
}
