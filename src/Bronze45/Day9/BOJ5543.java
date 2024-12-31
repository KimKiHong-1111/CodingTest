package Bronze45.Day9;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min_f = Math.min(a, Math.min(b, c));
        int d = sc.nextInt();
        int e = sc.nextInt();
        int min_g = Math.min(d,e);
        System.out.println(min_f+min_g-50);
    }

}
