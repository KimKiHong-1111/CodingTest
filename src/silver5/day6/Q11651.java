package silver5.day6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11651 {
    public static void main(String[] args) throws IOException {
        ArrayList<Point>list =  new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        list.add(new Point(x,y));
        }
        list.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.y == o2.y) {
                    return o1.x - o2.x;
                }
                return o1.y - o2.y;
            }
        });
        for (Point point : list) {
            System.out.println(point.x + " " + point.y);
        }

    }
}



class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}