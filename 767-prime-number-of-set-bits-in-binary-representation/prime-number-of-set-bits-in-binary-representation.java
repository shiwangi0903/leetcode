class Solution {
    /*public int countPrimeSetBits(int left, int right) {
        int c =0;
        for(int i = left;i<=right;i++){
            int n=i;
            int res=0;
            while(n>0){
                n=n&(n-1);
                res++;
            }
            if (isPrime(res))
                c++;       
        }
        return c;
    }

    public boolean isPrime(int res){

        if(res==2 || res==3)
            return true;
        else if(res==1||res%2==0||res%3==0)
            return false;
        for(int j=5; j*j<res;j=j+6){
            if(res%j==0||(res%(j+2)==0))
                return false;
        }
        return true;
    }*/

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            switch (Integer.bitCount(i)) { 
                case 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 -> count++; }
        }
        return count;
    }
}