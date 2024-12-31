package silver5.day2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Silver1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String>myarr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String now = br.readLine();
            if (!myarr.contains(now)) {
                myarr.add(now); //중복되는 값 제거
            }
        }
        myarr.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2); //사전 순 정렬
            }
            return o1.length() - o2.length(); //길이가 짧은 순으로 정렬
        });
        for (int i = 0; i < myarr.size(); i++) {
            System.out.println(myarr.get(i));
        }


    }
}
