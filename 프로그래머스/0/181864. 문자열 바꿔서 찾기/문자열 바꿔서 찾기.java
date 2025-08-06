class Solution {
    public int solution(String myString, String pat) {
		int answer = 0;
		StringBuilder sb = new StringBuilder(myString);
		for (int i = 0; i < myString.length(); i++) {
			if (sb.charAt(i) == 'A') {
				sb.setCharAt(i, 'B');
			} else if (sb.charAt(i) == 'B') {
				sb.setCharAt(i, 'A');
			}
		}
		if (sb.toString().contains(pat)) {
			answer++;
		}
		
		return answer;
	}
}