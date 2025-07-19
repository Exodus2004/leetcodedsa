/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        int l = 0;
        int r = n-1;
        while(l<r){
            int m = (l+r)/2;
            
            if(mountainArr.get(m)<mountainArr.get(m+1)){
                l = m+1;


            }
            else{
                r= m;
            }

        }

        if(fun1(target,mountainArr,l)==-1) return fun2(target,mountainArr,l);

        return fun1(target,mountainArr,l);




        
    }
    static int fun1(int target, MountainArray mountainArr,int l){
        int i = 0;
        int j = l;

        while(i<=j){
            int m = (i+j)/2;
            int val = mountainArr.get(m);

            if(val==target) return m;

            else if(mountainArr.get(m)<target){
                i = m+1;
            }
            else j = m-1;
        }
        return -1;
    }
    static int fun2(int target, MountainArray mountainArr,int l){
        int i = l+1;
        int j = mountainArr.length()-1;

        while(i<=j){
            int m = (i+j)/2;
            int val = mountainArr.get(m);

            if(val==target) return m;

            else if(mountainArr.get(m)>target){
                i =m+1;
            }
            else j = m-1;
        }
        return -1;
    }
    


}