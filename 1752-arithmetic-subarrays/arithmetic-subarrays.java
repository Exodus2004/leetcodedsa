class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res= new ArrayList<>();
        for(int i=0;i<l.length;i++){
            res.add(fun(nums,l[i],r[i]));
        } 
        return res;
        

    }
    boolean fun(int a[],int l,int r){
        List<Integer> temp = new ArrayList<>();
        for(int j=l;j<=r;j++) temp.add(a[j]);
        boolean as = true;
        boolean ds = true;
        Collections.sort(temp);
        for(int i = 2;i<temp.size();i++){
            if(temp.get(i)-temp.get(i-1)!=temp.get(i-1)-temp.get(i-2)) as =false;
        }
        Collections.sort(temp,Collections.reverseOrder());
        for(int i =2;i<temp.size();i++){
            if(temp.get(i-1)-temp.get(i)!=temp.get(i-2)-temp.get(i-1)) ds = false;

        }
        return as||ds;


    }
}