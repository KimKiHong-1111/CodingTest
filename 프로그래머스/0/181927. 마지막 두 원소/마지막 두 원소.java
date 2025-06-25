import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < num_list.length; i++) {
			list.add(num_list[i]);
		}
		if (list.get(num_list.length-1 ) <= list.get(num_list.length - 2)) {
			list.add(list.get(num_list.length-1)*2);

		} else if (list.get(num_list.length-1) > list.get(num_list.length - 2)) {
			list.add(list.get(num_list.length - 1) - list.get(num_list.length - 2));
		}
		answer = list.stream().mapToInt(i -> i).toArray();
		return answer;
	}
}