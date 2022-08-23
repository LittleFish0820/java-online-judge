package intput_output;

import java.util.Scanner;

public class OJ_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            System.out.println(in.nextInt() + in.nextInt());
        }
        in.close();
    }
}
