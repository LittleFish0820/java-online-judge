package intput_output;

import java.util.Scanner;
import java.util.Arrays;

public class OJ_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String[] arr = in.nextLine().split(",");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println(arr[arr.length - 1]);
        }
        in.close();
    }
}
