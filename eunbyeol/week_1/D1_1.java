class D1_1 {
    public int solution(String t, String p) {
        int answer = 0;
        int pSize = p.length();
        int tSize = t.length();
        long numberP = Long.parseLong(p);

        for (int i = 0; i < tSize-pSize+1 ; i++) {
            Long piece = Long.parseLong(t.substring(i, i + pSize));
            System.out.println(piece + " " + numberP);
            if (piece <= numberP) {
                answer++;
            }
        }
        return answer;
    }
}

/*
1. p의 길이를 구한다.
2. t를 앞에서부터 p의 길이만큼 자른다.
3. 자른 문자열을 숫자로 바꾼다.
4. p와 숫자를 비교해서 작거나 같으면 count를 더한다.
*/