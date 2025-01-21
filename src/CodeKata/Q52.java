package CodeKata;

public class Q52 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n > 1){
            //n개의 병을 a병당 b개를 리필해줄때
            answer += (n/a)*b;
            n = (n/a*b) + (n%a);
        }
        return answer;
    }
}