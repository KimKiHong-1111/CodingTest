package CodeKata;

public class Q20 {
    public long solution(long n) {
        String s = String.valueOf(n);
        int A[] = new int[10];
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            int num = Integer.parseInt(String.valueOf(temp[i]));
            A[num]++;
        }
        long answer = 0;
        for (int i = 9; i >= 0;) {
            if (A[i] != 0) {
                answer = (answer + i)*10;
                A[i]--;
            } else {
                i--;
            }
        }return answer/10;
    }
}