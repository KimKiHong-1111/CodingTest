package CodeKata;

public  class Q31 {
    public String solution(int n) {
        String answer = "수";
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer +="박";
            }
        }
        return answer;
    }
}