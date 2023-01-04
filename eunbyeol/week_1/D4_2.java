import java.util.*;

class D4_2 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> numberMap = new HashMap<>();


        for (int elem : tangerine) {
            numberMap.put(elem, numberMap.getOrDefault(elem, 0) + 1);
        }

        List<Integer> keyList = new ArrayList<>(numberMap.keySet());
        keyList.sort((o1, o2) -> numberMap.get(o2) - numberMap.get(o1));

        for (Integer key : keyList) {
            k -= numberMap.get(key);
            answer++;
            if (k <= 0) {
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