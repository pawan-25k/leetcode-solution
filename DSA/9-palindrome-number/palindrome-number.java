class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        boolean ans=false;
        int rev=0;
        while(x>0){
            int a=x%10;
            rev=rev*10+a;
            x=x/10;
        }
        if(original==rev){
            ans=true;
        }
        return ans;
    }
}