class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> operations = new ArrayList<>();
        int i = 0; 
        
        for (int num = 1; num <= n; num++) {
            
            if (i == target.length) {
                break;  
            }
            
            operations.add("Push");
            
            if (num == target[i]) {
                i++;   
            } else {
                operations.add("Pop");
            }
        }
        
        return operations;
    }
}