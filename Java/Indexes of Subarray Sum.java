import java.util.ArrayList;
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int currentSum = 0;
        int start = 0;
        int n=arr.length;
        for (int last = 0; last < n; last++) {
            currentSum += arr[last];
            while (currentSum > target && start < last) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == target) {
                res.add(start + 1); 
                res.add(last + 1);  
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}
