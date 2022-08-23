package intput_output;

import java.util.Scanner;

public class OJ_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int sum = 0;
            while (n > 0) {
                sum += in.nextInt();
                n--;
            }
            System.out.println(sum);
        }
        in.close();
    }
}
