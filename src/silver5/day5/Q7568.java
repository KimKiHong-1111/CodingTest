package silver5.day5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        ArrayList<people>peoples = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int x = sc.nextInt();
            int y = sc.nextInt();
            peoples.add(new people(x,y));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (peoples.get(i).x < peoples.get(j).x && peoples.get(i).y < peoples.get(j).y) {
                    d[i]++;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print((d[i]+1)+ " ");
        }
    }

}

class people {
    int x;
    int y;

    public people(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

