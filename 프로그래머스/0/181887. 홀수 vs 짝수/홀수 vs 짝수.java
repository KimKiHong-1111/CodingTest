class Solution {
    public int solution(int[] num_list) {
		int answer = 0;
		int n = 0;
		int m = 0;
			
		for (int i = 0; i < num_list.length; i++ ) {
			if (i % 2 == 0) {
				n += num_list[i];
			} else {
				m += num_list[i];
			}
			answer = Math.max(m, n);
		}
		return answer;
	}
}