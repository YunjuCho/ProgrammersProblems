public class D2_1 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i++) {
            answer[i] = -1;
            int cnt = 1;
            for (int j = i-1; j > -1; j--) {
                if (arr[i] == arr[j]) {
                    answer[i] = cnt;
                    break;
                }
                cnt++;
            }
        }
        return answer;
    }
}

/*
1. String을 배열로 바꾼다.
2. 두번째 원소부터 앞에 같은 글자가 있는지 검사한다.
3. 같은 글자가 있으면 해당 count를 반환한다.
*/
