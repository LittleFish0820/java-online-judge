package intput_output;

import java.util.Scanner;
import java.util.Arrays;

public class OJ_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int n = in.nextInt();   无法通过，原因是没有行读

        int n = Integer.parseInt(in.nextLine());
        String[] arr = in.nextLine().split(" ");
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.print(s + " ");
        }
        in.close();
    }
}