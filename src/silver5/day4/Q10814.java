package silver5.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<People>peoples =new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            peoples.add(new People(age,name));
        }
        peoples.sort(Comparator.comparingInt(o->o.age));
        for (People now : peoples) {
            System.out.println(now.age + " " + now.name);
        }
    }
}

class People {
    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }
}