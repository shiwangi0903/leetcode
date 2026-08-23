class Solution {
    public int minBitFlips(int start, int goal) {
        int a =start^goal;
        int res=0;
        while(a>0){
            a=a&(a-1);
            res++;
        }
        return res;
    }
}