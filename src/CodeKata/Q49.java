package CodeKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q49 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1 ; j < numbers.length; j++) {
                    if (!list.contains(numbers[i]+numbers[j])){
                        list.add(numbers[i]+numbers[j]);
                    }

                }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Q49 q49 = new Q49();
        int[] numbers = {5,0,2,7};
        System.out.println(Arrays.toString(q49.solution(numbers)));
    }
}
