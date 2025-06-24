import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int a, int d, boolean[] included) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		list.add(a);
		for (int i = 1; i <= included.length; i++) {
			int n = a+(d*i);
			list.add(n);
		}
		
		for (int i = 0; i < included.length; i++) {
			if (included[i]) {
				answer += list.get(i);
			}
		}
		
		return answer;
	}
}