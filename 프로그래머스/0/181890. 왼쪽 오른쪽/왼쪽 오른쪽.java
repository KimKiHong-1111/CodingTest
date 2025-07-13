import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].equals("l")) {
				// "l"이 나오면 왼쪽 부분 리턴
				return Arrays.copyOfRange(str_list, 0, i);
			} else if (str_list[i].equals("r")) {
				// "r"이 나오면 오른쪽 부분 리턴
				return Arrays.copyOfRange(str_list, i + 1, str_list.length);
			}
		}
		// "l"이나 "r"이 없으면 빈 배열 리턴
		return new String[0];
	}
}