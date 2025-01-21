package CodeKata;

import java.util.Arrays;

public  class Q25 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int arrnum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        int[] answer = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[arrnum] = arr[i];
                arrnum++;
            }
            if (count == 0) {
                answer = new int[]{-1};
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
