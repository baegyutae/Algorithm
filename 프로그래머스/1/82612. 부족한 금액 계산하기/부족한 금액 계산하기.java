class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = (long)price * count * (count + 1) / 2;
        long shortage = totalCost - money;

        if (shortage > 0) {
            return shortage;
        } else {
            return 0;
        }
    }
}