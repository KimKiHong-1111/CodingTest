package Bronze3;

import java.util.Scanner;

public class bronze2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int max_index = 0; //몇번쨰 값인지
        for (int i = 1; i < 10; i++) {
            int temp = sc.nextInt();
            if (temp > max) {
                max = temp;
                max_index = i;
            }

        }
        System.out.println(max);
        System.out.println(max_index);

    }
}
