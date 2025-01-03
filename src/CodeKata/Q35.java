package CodeKata;

public class Q35 {
    public long solution(int price, int money, int count) {
        long result = 0;
        long answer = 0;
        for (int i = 0; i <= count; i++) {
            result += i*price;
        }
        answer = result-money;
        if (answer < 0)
            answer=0;

        return answer;
    }
}