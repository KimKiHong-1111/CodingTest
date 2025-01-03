package CodeKata;

import java.util.Arrays;
import java.util.Collections;

public class Q34 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (String a : arr)
            answer += a;
        return answer;
    }
}