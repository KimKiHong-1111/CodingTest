import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start_num, int end_num) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		for (int i = start_num; i <= end_num; i++) {
			list.add(i);
		}
		answer = list.stream().mapToInt(i -> i).toArray();
		return answer;
	}
}