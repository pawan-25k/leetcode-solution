class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int index = 0; 

        for (int i = 1;i<= n;i++) {
            ans.add("Push");
            if (index < target.length && i == target[index]) {
                index++;
            } 
 
            else {
                ans.add("Pop");
            }

            if (index == target.length) {
                break;
            }
        }

        return ans;
        
    }
}