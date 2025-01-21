package CodeKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q48 {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();


        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] sliceArray = Arrays.copyOfRange(array, start, end);
            //복사할 배열, 시작점, 끝점.
            Arrays.sort(sliceArray);

            answer.add(sliceArray[k]);
        }
        return answer;
    }


    public static void main(String[] args) {
        Q48 q48 = new Q48();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(q48.solution(array,commands));
    }
}
