package intput_output;

import java.util.Scanner;

public class OJ_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 0) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += in.nextInt();
            }
            System.out.println(sum);
            n = in.nextInt();
        }
        in.close();
    }
}