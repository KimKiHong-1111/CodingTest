package silver5.day3;

import java.util.Scanner;

public class Silver1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int x = 1;
        int y = 1;
        int dir = -1;
        while (count < N) {
            if (x == 1 && dir == -1) {
                y++;
                dir = 1; //dir = 1 은 내려오고있다는 뜻
            } else if (y == 1 && dir == 1) {
                x++;
                dir = -1;
            } else if (dir == 1) {
                x++;
                y--;
            } else {
                x--;
                y++;
            }
            count++;
        }
        System.out.println(x+"/"+y);
    }
}
