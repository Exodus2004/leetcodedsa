class Solution {
    public int arrangeCoins(int n) {
        long l = 1;
        long r = n;

        while(l<=r){
            long mid = l+(r-l)/2;
            if((long)(mid*(mid+1)/2)==n) return (int)mid;

            else if((long)(mid*(mid+1)/2)>n) r = mid-1;

            else l = mid+1;

        }
        return (int)l-1;
        
    }
}