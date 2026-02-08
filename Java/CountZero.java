
class CountZero{
    int countZeroes(int[] arr) {
       
        int n=arr.length;int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                break;
            }else if(arr[i]==1){
                count+=1;
            }
        }
        return n-count;
    }
}
