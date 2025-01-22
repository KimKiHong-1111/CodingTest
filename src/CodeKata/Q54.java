package CodeKata;

public class Q54 {
    public String solution(int a, int b) {
        String answer = "";
        //요일
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        //1월부터 12월까지
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 달을 일자로 바꾸기

        int days =0;
        for (int i = 0; i < a - 1; i++) {
            days += month[i];
        }
        days += (b-1);
        answer = day[days%7];
        return answer;
    }

}