import java.util.HashMap;

public class D2_1 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer[i] = i - indexMap.getOrDefault(c, i + 1);
            indexMap.put(c, i);
        }
        return answer;
    }
}

/*
1. 왼쪽부터 오른쪽으로 문자열을 탐색한다.
2. 맵에 해당 키의 인덱스를 불러온다.
    - 저장된 값이 없으면 i+1을 가져온다.
2. 맵에 키와 인덱스를 저장한다.(갱신)
3. 위치를 계산한다.
    - 위치 : 해당 원소의 인덱스 - 이전 원소의 인덱스
*/
