class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        else
        {
            int temp = x;
            int num, rev=0;
            while(temp>0){
                num = temp%10;
                rev = rev * 10 + num;
                temp = temp/10;
            }
            return (x==rev);
        }
    }
}