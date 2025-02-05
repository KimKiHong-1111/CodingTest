package CodeKata;

import java.util.ArrayList;

public class Q58 {
    public int solution(int[] nums) {
        int answer = 0;


        //숫자 3개를 더하는 배열을 만들기
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int p = j + 1; p < nums.length; p++) {
                    list.add(nums[i]+nums[j]+nums[p]);
                }
            }
        }

        //소수인지 아닌지 판별하는 곳.
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i); // 인덱스가 아닌 실제 값 가져오기
            int count = 2;
            answer++;

            while (count < num) {
                if (num % count == 0) {
                    answer--;
                    break;
                }
                count++;
            }
        }

        return answer;
    }
}

