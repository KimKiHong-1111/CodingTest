package CodeKata;

public  class Q30 {
    public String solution(String s) {
        int n =  s.length()/2;
        String answer = "";
        if ((s.length() % 2) == 0) {
            answer = String.valueOf(s.charAt(n-1))+String.valueOf(s.charAt(n));
        } else {
            answer = String.valueOf(s.charAt(n));
        }
        return answer;
    }
}
