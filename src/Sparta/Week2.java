package Sparta;

import java.util.ArrayList;
import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type =sc.nextLine();
        String title = sc.nextLine();
        System.out.println("[" + type + "으로 저장된 "+ title + "]");
        ArrayList<String>list = new ArrayList<>();
        do {
            list.add(sc.nextLine());

        } while (!list.contains("끝"));

        for (int i = 0; i < list.size()-1; i++) {
            System.out.println((i+1)+". " + list.get(i));
        }
    }
}