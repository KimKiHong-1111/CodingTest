import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
		
		String[] str = myStr.split("[abc]");

		// 빈 문자열 요소를 제거하고 배열로 반환
		str = Arrays.stream(str)
			.filter(s -> !s.isEmpty()) // 빈 문자열은 제외
			.toArray(String[]::new);

		return str.length == 0 ? new String[]{"EMPTY"} : str;
		
	}
}