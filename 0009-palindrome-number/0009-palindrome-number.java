class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long reverse=0;
        int digit=0,temp=x;
        while(temp!=0){
            digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        return (x==reverse);
    }
}