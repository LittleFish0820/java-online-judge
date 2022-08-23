package intput_output;

import java.util.Scanner;

public class OJ_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLong()) {
            System.out.println(in.nextLong() + in.nextLong());
        }
        in.close();
    }
}