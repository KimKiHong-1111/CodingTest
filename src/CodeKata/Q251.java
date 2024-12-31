package CodeKata;

import java.util.ArrayList;
import java.util.Arrays;


public  class Q251 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer>list = new ArrayList<>();
        int[] answer = {-1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.size() != 0) {
            return answer;
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
               answer[i] = list.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}