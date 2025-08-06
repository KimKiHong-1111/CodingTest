class Solution {
    public int solution(String binomial) {
		int answer = 0;
		String[] arr = binomial.split(" ");
		int first = Integer.parseInt(arr[0]);
		int third = Integer.parseInt(arr[2]);
		if (arr[1].equals("+")) {
			answer = first + third;
		} else if (arr[1].equals("-")) {
			answer = first - third;
		} else if (arr[1].equals("*")) {
			answer = first * third;
		} 
		return answer;
	}
}