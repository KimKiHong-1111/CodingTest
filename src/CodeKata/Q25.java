package CodeKata;

import java.util.Arrays;

public  class Q25 {
    public int[] solution(int[] arr, int divisor) {
        // 1. answer 값 고정을 위한 나누어떨어지는 값 개수 체크
        int count = 0; // 나누어떨어지는 값 개수
        int arrnum = 0; // 실제 배열크기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        // 배열 크기
        int[] answer = new int[count];
        // 나누어 떨어지는 값 answer에 넣기
        for (int i = 0; i < arr.length; i++) {
            // 나누어 떨어질때
            if (arr[i] % divisor == 0) {
                answer[arrnum] = arr[i];
                arrnum++;
            }
            // 떨어지지 않을때
            if (count == 0) {
                answer = new int[]{-1};
            }
        }
        // 정렬
        Arrays.sort(answer);
        return answer;
    }
}
