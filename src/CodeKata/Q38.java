package CodeKata;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String a = "";

        for (int i = 0; i < n; i++) {
            a += "*";
        }
        for (int i = 0; i < m; i++) {
            System.out.println(a);
        }
    }
}