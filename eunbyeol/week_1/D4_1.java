import java.util.PriorityQueue;

class D4_1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            priorityQueueLowest.add(score[i]);

            if (priorityQueueLowest.size() > k) {
                priorityQueueLowest.poll();
            }
            answer[i] = priorityQueueLowest.peek();
        }
        return answer;
    }
}

/*
1. 우선순위 큐(최소힙) 사용
    - score를 돌면서 하나씩 큐에 추가한다.
    - 큐의 루트노드가 최하위가 된다.
2. 큐의 크기를 최대 k로 유지한다!!
    - 큐가 k를 넘어서면 루트노드를 제거한다.
*/