package CodeKata;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String p = sc.nextLine();
        int answer = 0;
        for (int i = 0; i < t.length(); i++) {
            String str = t.substring(t.indexOf(i),i+p.length());
            System.out.println(str);
/*
            if (Integer.parseInt(str) <= Integer.parseInt(p)) {
                answer++;
            }
*/
        }
    }
}