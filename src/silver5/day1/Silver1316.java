package silver5.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int[] check = new int[26]; //0~25 배열이 생김 아스키 코드 'z' - 'a' = 25다. a= 0번째 z는 25번째 총 26개 필요
            char[] text = br.readLine().toCharArray(); //ex)happy 를 입력하면 h a p p y 로 배열한다.
            //첫번째 문자 선처리
            char before = text[0];
            check[(int)(before-'a')] = 1;
            boolean group = true;
            for (int j = 1; j < text.length; j++) {
                char now = text[j];
                //연속된 글자가 아닌데 이전에 들어온 경우가 있는 경우(그룹단어가 아니다.)
                if (before != now && check[(int) (now - 'a')] == 1) {
                    group = false;
                    break;
                }
                check[(int) (now - 'a')] = 1;
                before = now;
            }
            if (group) {
                count++;
            }
        }
        System.out.println(count);
    }
}
