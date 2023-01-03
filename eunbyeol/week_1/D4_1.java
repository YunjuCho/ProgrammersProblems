import java.util.Arrays;
import java.util.Collections;

class Solution7 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);

        for (int d = 0; d < score.length; d++) {
            Arrays.sort(scores, 0, d+1, Collections.reverseOrder());
            if (d < k) {
                answer[d] = scores[d];
            }
            else {
                answer[d] = scores[k-1];
            }
        }
        return answer;
    }
}

/*
0. 내림차순 정렬
1. d = 0~k-1 : d번째 원소가 최하위
2. d = k-1~score.legnth() : k-1번째 원소가 최하위

[1000, 500, 300, 300, 150, 70, 50, 40, 20, 0]
[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]

1. 0
2. 0, 300
3. 0, 40, 300
4. 0, 40, 300, 300
5. 20, 40, 300, 300
6. 40, 70, 300, 300
7. 70, 150, 300, 300
8. 70, 150, 300, 300
9. 150, 300, 300, 500
10. 300, 300, 500, 1000

1. 0
2. 300, 0
3. 300, 40, 0
4. 300, 300, 40, 0
5. 300, 300, 40, 20
6. 300, 300, 70, 40
7. 300, 300, 150, 70
8. 300, 300, 150, 70
9. 500, 300, 300, 150
10. 1000, 500, 300, 300
[10, 10, 10, 20, 20, 100, 100]
[0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
*/