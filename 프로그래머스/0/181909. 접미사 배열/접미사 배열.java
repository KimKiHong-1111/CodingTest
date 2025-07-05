import java.util.ArrayList;
import java.util.List;

class Solution {
   public String[] solution(String my_string) {
		String[] answer = {};
		List<String> list = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i++) {
			String sub = my_string.substring(i);
			list.add(sub);
		}
		list.sort(String::compareTo);
		answer = list.toArray(answer);
		return answer;
	}
}