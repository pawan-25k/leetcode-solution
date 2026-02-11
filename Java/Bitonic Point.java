
class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int n=arr.length;
        int max=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                max=arr[i];
                break;
            }else if(arr[n-1]>arr[n-2]){
                return arr[n];
                    
                }
            }
            return max;
        }
        
        
    }
