package CodeKata;

public class Q36 {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                    return answer =false;
                }else answer = true;
            }
        }else answer = false;
        return answer;
    }
}