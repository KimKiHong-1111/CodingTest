import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n, String control) {
		int answer = n;

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < control.length(); i++) {
			list.add((int)control.charAt(i));
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 'w') {
				answer += 1;
			}
			if (list.get(i) == 's') {
				answer -= 1;
			}
			if (list.get(i) == 'd') {
				answer += 10;
			}
			if (list.get(i) == 'a') {
				answer -= 10;
			}
		}

		return answer;
	}
}