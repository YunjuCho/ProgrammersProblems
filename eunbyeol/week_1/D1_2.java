class D1_2 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        int colSize = data.length;
        int rowSize = data[0].length;

        for (int i = 0; i < colSize-1; i++) {
            for (int j = i+1; j < colSize; j++) {
                if (data[i][col-1] > data[j][col-1]) {
                    swap(data, i, j);
                }
                else if (data[i][col-1] == data[j][col-1]) {
                    if (data[i][0] < data[j][0]) {
                        swap(data, i, j);
                    }
                }
            }
        }
        q
        for (int i = row_begin-1; i < row_end; i++) {
            int sum = 0;
            for (int j = 0; j < rowSize; j++) {
                sum += data[i][j] % (i + 1);
            }
            answer ^= sum;
        }
        return answer;
    }

    public void swap(int[][] data, int i, int j) {
        int[] tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

//    public void printData(int[][] data) {
//        int colSize = data.length;
//        int rowSize = data[0].length;
//        for (int i = 0; i < colSize; i++) {
//            for (int j = 0; j < rowSize; j++) {
//                System.out.print(data[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
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