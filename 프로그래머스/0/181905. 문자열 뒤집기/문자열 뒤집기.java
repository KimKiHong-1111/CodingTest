class Solution {
    public String solution(String my_string, int s, int e) {
		String front = my_string.substring(0, s);
		StringBuilder mid = new StringBuilder(my_string.substring(s, e+1)).reverse();
		String back = my_string.substring(e+1);
		

		return front + mid + back;
	}
}