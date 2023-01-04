class D3_2 {
    public long solution(int k, int d) {
        long answer = 0L;
        long cnt = 0L;
        for (int a = k; a <= d; a+=k) {
            for (int b = d-(d%k); b > 0; b-=k) {
                if (a*a + b*b <= d*d) {
                    break;
                }
//                System.out.println("(" + a + ", " + b + ")");
                cnt++;
            }
            System.out.println();
        }
        System.out.println(cnt);
        answer = (d/k+1)*(d/k+1) - cnt;
        return answer;
    }
}

/*
1. 원점과의 거리가 큰 경우 계산
    - 원점과의 거리: a^2 + b^2 > d^2 이면 cnt++
2. 점 개수 구하기
    - K*K - cnt

예외사항
1. 끝점이 일치하는 경우
2. 끝점이 일치하지 않는 경우

(0, 0), (0, 2), (0, 4),
(2, 0), (2, 2),
(4, 0)

(0, 0), (0, 1), (0, 2), (0, 3), (0, 4), (0, 5),
(1, 0), (1, 1), (1, 2), (1, 3), (1, 4),
(2, 0), (2, 1), (2, 2), (2, 3), (2, 4),
(3, 0), (3, 1), (3, 2), (3, 3), (3, 4),
(4, 0), (4, 1), (4, 2), (4, 3),
(5, 0)
*/