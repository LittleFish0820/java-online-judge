package intput_output;

import java.util.Scanner;
import java.util.Arrays;

public class OJ_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] arr = in.nextLine().split(" ");
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.print(s + " ");
        }
        in.close();
    }
}