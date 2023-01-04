class D3_1 {
    public int solution(String s) {
        int answer = 0;
        int xCnt = 1;
        int yCnt = 0;

        char x = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char y = s.charAt(i);
            if (y == x) {
                xCnt++;
            }
            else {
                yCnt++;
            }
            if (xCnt == yCnt) {
                answer++;
                if (i == s.length()-1) {
                    break;
                }
                x = s.charAt(i+1);
                i++;
                xCnt = 1;
                yCnt = 0;
            }
        }
        if (xCnt != yCnt) {
            answer++;
        }
        return answer;
    }
}

/*
1. 첫번째 원소가 x가 된다. xCnt = 1, yCnt = 0
2. xCnt == yCnt가 되면 result + 1, 그 다음 원소가 x가 된다.
3. 다음 원소가 x와 같으면 xCnt + 1
4. 다르면 yCnt + 1
4. 문자열이 다 돌때까지 반복
5. x가 cnt가 다르면 result + 1
*/