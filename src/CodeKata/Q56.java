package CodeKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] arr = new int[m];
        //만약에 {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2} 가 스코어라면.
        Arrays.sort(score);
        //{1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4} 가 된다.
        // 1 2개  2 4개 4 6개
        //여기서 한상자에 m 개씩 3개씩
        //{1,1,2},{2,2,2},{4,4,4} {4,4,4}
        List<Integer>list = new ArrayList<>();
        for (int i = score.length-m; i >= 0 ; i -= m) {
            answer += score[i] * m;
        }

        return answer;
    }
}