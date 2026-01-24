class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int n = plants.length;
        int l = 0;
        int r = n-1;
        int ma = capacityA;
        int mb = capacityB;
        int c = 0;
        while(l<r){
            if(ma>=plants[l]){
                ma-=plants[l++];

            }
            else{
                c++;
                ma = capacityA;
                ma-=plants[l];

                l++;
            }
            if(mb>=plants[r]){
                mb-=plants[r--];
            }
            else{
                c++;
                mb = capacityB;
                mb-=plants[r];
                r--;
            }
            
        }
        System.out.println(ma);
        System.out.println(mb);
        if(l==r){
            if(ma<plants[l] && mb<plants[r]) c++;
        }
        return c;
        
    }
}