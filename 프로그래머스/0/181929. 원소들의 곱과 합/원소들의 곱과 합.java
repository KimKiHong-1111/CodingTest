class Solution {
   public int solution(int[] num_list) {
		int answer = 0;
		int sum = 0;
		int n = 1;
		for (int j : num_list) {
			sum += j;
			n *= j;
		}
		if (sum * sum > n) {
			answer = 1;
		}
		return answer;
	}
}