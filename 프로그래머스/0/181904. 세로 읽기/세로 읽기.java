class Solution {
    public String solution(String my_string, int m, int c) {
		StringBuilder ans = new StringBuilder();
		int len = my_string.length();
		for (int i = c-1; i < len; i += m) {
			ans.append(my_string.charAt(i));
		}

		return ans.toString();
	}
}