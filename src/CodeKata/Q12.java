package CodeKata;

public class Q12 {
    public double solution(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double answer = (double) sum/arr.length;
        return answer;
    }
}