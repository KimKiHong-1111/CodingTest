class Solution {
    public String solution(String my_string, String alp) {
		StringBuilder sb = new StringBuilder(my_string.toLowerCase());
		char target = alp.charAt(0);
		char upperTarget = Character.toUpperCase(target);
		for (int i = 0; i < my_string.length(); i++) {
			if (sb.charAt(i) == target) {
				sb.setCharAt(i, upperTarget );
			}
		}
		return sb.toString();
	}
}