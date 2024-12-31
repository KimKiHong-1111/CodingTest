package CodeKata;

public class Q17 {
    public int[] solution(long n) {
        String a = ""+ n;
        int[] answer = new int[a.length()];

        int remain = 0;

        while (n > 0) {
            answer[remain] = (int) (n%10);
            n = n/10;
            remain++;
        }

        return answer;
    }
}