package silver5.day2;

import java.util.Scanner;

public class silver2941 {
    public static void main(String[] args) {
        String check1 = "dz=";
        String[] check2 = {"c=","c-","d-","lj","nj","s=","z="};
        int count = 0;

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();


        for (int i = 0; i < a.length() - 1;) { //0부터 시작해서 1을 빼준다.
            if (i < a.length() - 2 && check1.equals(a.substring(i, i + 3))) { //check1 dz= 맞았을때
                count += 2;
                i += 3;
            } else {
                boolean match = false;
                String now = a.substring(i,i+2);
                for (int j = 0; j < check2.length; j++) { // check2 맞았을때
                    if (check2[j].equals(now)) {
                        count += 1;
                        i += 2;
                        match = true;
                        break;
                    }
                }
                if (!match) { //둘다 해당 안될 경우
                    i++;
                }
            }
        }
        System.out.println(a.length()-count);
    }
}
