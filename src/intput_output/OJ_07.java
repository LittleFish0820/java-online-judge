package intput_output;

import java.util.Scanner;

public class OJ_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String[] arr = in.nextLine().split(" ");
            int sum = 0;
            for (String s : arr) {
                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        }
        in.close();
    }
}