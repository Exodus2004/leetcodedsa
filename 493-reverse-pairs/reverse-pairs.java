class Solution {
    private int count = 0;

    public int reversePairs(int[] nums) {
        divide(nums,0,nums.length-1);
        return count;

        
    }
    private void divide(int a[],int si,int ei){
        if(si>=ei) return;

        int mid = si+(ei-si)/2;
        divide(a,si,mid);
        divide(a,mid+1,ei);

        conquer(a,si,mid,ei);

    }
    private void conquer(int a[],int si,int mid,int ei){
        int newarr[] = new int[ei-si+1];
        int i1 = si;
        int i2 = mid+1;
        int x = 0;
        int j= mid+1;
        for(int i = si;i<=mid;i++){

            while(j<=ei && (long)a[i]>2L*(long)a[j]) j++;
            count+=j-(mid+1);
            
        }
    
        

        

        while(i1<=mid && i2<=ei){
            if(a[i1]<=a[i2]){
                newarr[x] = a[i1];
                i1++;
                x++;
            
            }
            else{
                newarr[x] = a[i2];
                x++;
                i2++;

            }
        }
        while(i1<= mid){
            newarr[x++] = a[i1++];

        }
        while(i2<=ei){
            newarr[x++] = a[i2++];


        }

        for(int i = 0;i<newarr.length;i++) a[si+i] = newarr[i];

    }
}