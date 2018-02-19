// https://wiki.sei.cmu.edu/confluence/display/java/NUM00-J.+Detect+or+prevent+integer+overflow

/*
1.1.1. Даны две целые переменные a , b . Составьте фрагмент программы, после исполнения которого значения переменных поменялись бы местами (новое значение a равно старому значению b и наоборот).
Решение.
Введём дополнительную целую переменную t .
t := a;
a := b;
b := t;

Попытка обойтись без дополнительной переменной, написав
a := b;
b := a;
не приводит к цели (безвозвратно утрачивается начальное значение переменной a ).

1.1.2. Решите предыдущую задачу, не используя дополнительных переменных (и предполагая, что значениями целых переменных могут быть произвольные целые числа).
Решение.
Начальные значения a и b обозначим a0 , b0 .
a := a + b; {a = a0 + b0, b = b0}
b := a - b; {a = a0 + b0, b = a0}
a := a - b; {a = b0, b = a0}

 */
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
