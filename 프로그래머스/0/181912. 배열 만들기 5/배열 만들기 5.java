import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < intStrs.length; i++) {
			String sub = intStrs[i].substring(s, s + l );
			int n = Integer.parseInt(sub);
			if (n > k) {
				list.add(n);
			}
		}
		answer = list.stream().mapToInt(i -> i).toArray();
		return answer;
	}
}