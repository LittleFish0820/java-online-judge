package intput_output;

import java.util.Scanner;

public class OJ_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            System.out.println(in.nextInt() + in.nextInt());
            t--;
        }
        in.close();
    }
}