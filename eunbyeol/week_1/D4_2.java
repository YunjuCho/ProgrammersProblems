import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution8 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            numberMap.put(tangerine[i], numberMap.getOrDefault(tangerine[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(numberMap.entrySet());
        entryList.sort((o1, o2) -> numberMap.get(o2.getKey()) - numberMap.get(o1.getKey()));

        for (Map.Entry<Integer, Integer> entry : entryList) {
            sum += entry.getValue();
            answer++;
            if (sum >= k) {
                break;
            }
        }
        return answer;
    }
}

/*
1. 배열 훑으면서 Map에 저장
2. Map 내림차순 정렬
3. value의 합 > k일 때까지 누적
 */