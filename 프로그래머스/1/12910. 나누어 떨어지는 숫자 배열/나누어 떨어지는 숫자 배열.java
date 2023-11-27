import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> divisibleNumbers = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) {
                divisibleNumbers.add(num);
            }
        }
        
        if (divisibleNumbers.isEmpty()) {
            return new int[]{-1};
        }
        
        Collections.sort(divisibleNumbers);
        
        int[] answer = new int[divisibleNumbers.size()];
        for (int i = 0; i < divisibleNumbers.size(); i++) {
            answer[i] = divisibleNumbers.get(i);
        }
        
        return answer;
    }
}