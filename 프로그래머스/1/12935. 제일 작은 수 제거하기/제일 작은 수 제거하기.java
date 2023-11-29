class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1}; // 배열 길이가 1일 경우 -1을 반환
        }

        int min = arr[0];
        // 최소값 찾기
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // 최소값을 제외한 배열 만들기
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int j : arr) {
            if (j != min) {
                answer[index++] = j;
            }
        }

        return answer;
    }
}