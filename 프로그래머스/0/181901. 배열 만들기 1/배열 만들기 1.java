import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (k * i <= n) {
				list.add(k * i);
			}
		}
		answer = list.stream().mapToInt(i -> i).toArray();
		return answer;
	}
}