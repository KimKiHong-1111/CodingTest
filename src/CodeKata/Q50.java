package CodeKata;

import java.util.ArrayList;
import java.util.List;

public class Q50 {
    public int[] solution(String s) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> answerlist = new ArrayList<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            list.add((int) arr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    answerlist.add(answerlist.indexOf(j) - answerlist.indexOf(i));
                } else {
                    answerlist.add(-1);
                }
            }
        }
        answer = answerlist.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
