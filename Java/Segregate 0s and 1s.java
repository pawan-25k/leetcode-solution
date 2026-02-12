import java.util.*;
class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int countZero=0;
        int countOne=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                countZero+=1;
            }
            if(arr[i]==1){
                countOne+=1;
            }
        }
        int j=0;
        for(;j<countZero;j++){
            arr[j]=0;
        }
         for(;j<countOne+countZero;j++){
            arr[j]=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
