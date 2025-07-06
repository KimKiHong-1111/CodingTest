import java.util.*;
public class Solution {
    
public String solution(String my_string, int[] indices) {
    // indices를 Set에 저장하여 O(1)로 포함 여부 확인
    Set<Integer> indexSet = new HashSet<>();
    for (int idx : indices) {
        indexSet.add(idx);
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < my_string.length(); i++) {
        if (!indexSet.contains(i)) { // indices에 없는 인덱스만 추가
            sb.append(my_string.charAt(i));
        }
    }
    return sb.toString();
}
}