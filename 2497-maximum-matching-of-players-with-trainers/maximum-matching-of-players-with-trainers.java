class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int val =0;
        int n = players.length;
        int m = trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0;
        int l = 0;
        int r = m-1;
        int lv = players[0];
        int rv  =players[n-1];


        int i = 0;
        int j = 0;


        while(i<n && j<m){
            if(players[i]<=trainers[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
        

        
    }
}