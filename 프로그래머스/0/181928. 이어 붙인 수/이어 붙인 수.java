class Solution {
    public int solution(int[] num_list) {
		int answer = 0;
		String n = "";
		String m = "";
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				n += Integer.toString(num_list[i]);
			} else {
				m += Integer.toString(num_list[i]);
			}
		}
		answer = Integer.parseInt(m) + Integer.parseInt(n);
		return answer;
	}
}