class Solution {
        public int[] solution(String[] strlist) {
            // strlist의 길이와 동일한 크기의 정수 배열을 생성합니다.
            int[] answer = new int[strlist.length];

            // 각 문자열의 길이를 계산하여 answer 배열에 저장합니다.
            for (int i = 0; i < strlist.length; i++) {
                answer[i] = strlist[i].length();
            }

            // 계산된 길이가 저장된 배열을 반환합니다.
            return answer;
        }
    }