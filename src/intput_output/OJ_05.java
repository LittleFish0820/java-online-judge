package intput_output;

import java.util.Scanner;

public class OJ_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n > 0) {
            int m = in.nextInt();
            int sum = 0;
            while (m > 0) {
                sum += in.nextInt();
                m--;
            }
            System.out.println(sum);
            n--;
        }
        in.close();
    }
}
