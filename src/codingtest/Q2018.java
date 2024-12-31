package codingtest;

import java.util.Scanner;

public class Q2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != n) {
            if (sum == n) {
                count++; end_index++;
                sum = sum + end_index; //순서유의
            } else if (sum > n) {
                sum = sum - start_index; start_index++;//순서 유의
            } else {
                end_index++; sum = sum + end_index;//순서 유의
            }
        }
        System.out.println(count);
    }
}
