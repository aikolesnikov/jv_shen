package utils;

import java.util.Scanner;

public class IO_Utils {

    public static int inputInt() {
        Scanner input = new Scanner(System.in);
        int i = 0;

        try {
            i = input.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong input, value is set to 0.");
        }

        return i;
    }

    public static int inputPositiveInt() {
        Scanner input = new Scanner(System.in);
        int i = 0;

        try {
            i = input.nextInt();
            if (i < 0) {
                i = 0;
                throw new Exception("Must be positive!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Wrong input, value is set to 0.");
        }

        return i;
    }

}
