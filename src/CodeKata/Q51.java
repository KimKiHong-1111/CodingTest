package CodeKata;

import java.util.ArrayList;
import java.util.List;


public class Q51 {
    public String solution(int[] food) {
    List<Integer> list = new ArrayList<>();

    // 음식 규칙에 따라 리스트에 추가
    for (int i = 1; i < food.length; i++) {
        int count = food[i] / 2; // 음식 수를 2로 나눈 몫만큼 추가
        for (int j = 0; j < count; j++) {
            list.add(i); // 음식 번호(i)를 추가
        }
    }

    // 결과 리스트에 0 추가 후, 대칭 구조로 리스트 완성
    List<Integer> reversed = new ArrayList<>(list);
    list.add(0); // 중앙에 0 추가
    for (int i = reversed.size() - 1; i >= 0; i--) {
        list.add(reversed.get(i)); // 역순으로 추가
    }

    // 결과를 문자열로 변환
    StringBuilder answer = new StringBuilder();
    for (int num : list) {
        answer.append(num);
    }

    return answer.toString();
}
}