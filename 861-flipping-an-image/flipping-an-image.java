class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i[]:image) rev(i,0,i.length-1);

        for(int i=0;i<image.length;i++){
            for(int j =0;j<image[0].length;j++){
                if(image[i][j]==1) image[i][j]=0;
                else image[i][j]=1;
            }

        }
        return image;


        
    }
    static void rev(int a[],int i,int j){
        int x = i;int y = j;

        while(x<y){
            int t = a[x];
            a[x] = a[y];
            a[y] = t;
            x++;y--;
        }
    }
}
