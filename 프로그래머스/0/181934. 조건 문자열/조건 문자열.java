class Solution {
    public int solution(String ineq, String eq, int n, int m) {
		int answer = 0;
		if(ineq.equals("<") && eq.equals("=")) {
			if (n <= m) {
				return answer = 1;
			} else {
				return answer;
			}
		}
		else if(ineq.equals("<") && eq.equals("!")) {
			if (n < m) {
				return answer = 1;
			} else {
				return answer;
			}
		}
		else if(ineq.equals(">") && eq.equals("=")) {
			if (n >= m) {
				return answer = 1;
			} else {
				return answer;
			}
		}
		else if(ineq.equals(">") && eq.equals("!")) {
			if (n > m) {
				return answer = 1;
			} else {
				return answer;
			}
		}
		return answer;
	}
}