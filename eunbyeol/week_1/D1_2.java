class D1_2 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        int rowSize = data[0].length;

        Arrays.sort(data, (o1, o2) -> {
            if (o1[col-1] == o2[col-1]) {
                return Integer.compare(o2[0], o1[0]);
            }
            return Integer.compare(o1[col-1], o2[col-1]);
        });

        for (int i = row_begin-1; i < row_end; i++) {
            int sum = 0;
            for (int j = 0; j < rowSize; j++) {
                sum += data[i][j] % (i + 1);
            }
            answer ^= sum;
        }
        return answer;
    }
}

/*
1. 테이블 정렬
    - 1순위 : col 번째 값을 기준으로 오름차순 정렬
    - 2순위 : 1번째 값을 기준으로 내림차순 정렬
2. S_i 누적 계산
    - begin-end 까지 S_i 계산
    - 연산값 answer에 추가

XOR : 값이 다를 때 1, 같을 때 0
*/