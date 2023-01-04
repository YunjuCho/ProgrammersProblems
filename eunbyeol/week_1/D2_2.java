import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class D2_2 {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        List<Integer> enemyList = Arrays.stream(enemy)
                .boxed()
                .collect(Collectors.toList());
        for (int i = 0; i < enemy.length; i++) {
            if (enemyList.get(i) <= n) {
                n -= enemyList.get(i);
                continue;
            }
            k--; // 무적권 사용
            if (k < 0) {
                answer = i;
                break;
            }

            Arrays.sort(enemy, 0, i);
//            System.out.println(Arrays.toString(enemy));
            int maxIndex = i;
            if (i != 0) {
                maxIndex = enemy[i] > enemy[i-1] ? i : i-1;
            }
            if (i != maxIndex) {
                n += enemy[maxIndex] - enemy[i];
            }

            enemy[maxIndex] *= -1;
        }
        return answer;
    }
}

/*
1. 왼쪽부터 배열을 탐색한다.
2. n보다 클 때 무적권을 사용한다. (꼭 사용해야 하는 상황만 사용)
    - 무적권을 사용하려는 원소보다 앞에 무적권을 사용하지 않은 더 작은 원소가 있으면 무적권을 앞으로 넘긴다.
    - 차이만큼만 sum을 더한다.
3. n보다 같거나 작을 때 sum을 더한다.

1. 배열을 내림차순으로 정렬한다.
2. K번째 원소부터 배열을 훑는다.
3. n보다 커질 때까지 값을 더한다.
4. 해당 인덱스를 반환한다.

1. 무적권을 사용한다.
2. 다음 원소가 이전보다 크면 무적권을

무적권 사용 경우의 수 = nCk
*/