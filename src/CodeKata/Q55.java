package CodeKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        //카드 1의 값
        int card1 = 0;
        //카드 2의 값
        int card2 = 0;

        int i = 0;
        //비교하기 cards1과 card2에 있는 단어가 goal에 있는 단어에 순서에 맞게 있는지
        while (i < goal.length) {
            if (card1 < cards1.length && goal[i].equals(cards1[card1])) {
                card1++;
            } else if (card2 < cards2.length && goal[i].equals(cards2[card2])) {
                card2++;
            } else {
                answer = "No";
                break;
            }
            i++;
        }

        return answer;
    }
}
