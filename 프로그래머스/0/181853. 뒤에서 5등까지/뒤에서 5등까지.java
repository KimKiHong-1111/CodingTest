import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
		int[] answer = {};
		Arrays.sort(num_list);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(num_list[i]);
		}
		return list.stream().mapToInt(i -> i).toArray();
	}
}