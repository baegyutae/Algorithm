class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]); // 더 큰 값을 가로로
            int height = Math.min(size[0], size[1]); // 더 작은 값을 세로로

            maxWidth = Math.max(maxWidth, width); // 최대 가로 길이 갱신
            maxHeight = Math.max(maxHeight, height); // 최대 세로 길이 갱신
        }

        return maxWidth * maxHeight; // 지갑의 크기
    }
}