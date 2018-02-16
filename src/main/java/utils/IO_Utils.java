package utils;

import java.util.Scanner;

public class IO_Utils {

    public final static int inputInt() {
        Scanner input = new Scanner(System.in);
        int i = 0;

        try {
            i = input.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong input, value is set to 0.");
        }

        return i;
    }

}
