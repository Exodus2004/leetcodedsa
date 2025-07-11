class Solution {
    class pair{
      String word;
      int count;
      pair(String word,int count){
        this.word = word;
        this.count = count;
      }

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        Set<String> set = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        boolean vis[] = new boolean[wordList.size()];



        Queue<pair> q = new LinkedList<>();
        q.add(new pair(beginWord,1));
        while(!q.isEmpty()){
            pair node = q.poll();
            String presentword = node.word;
            int count = node.count;

            if(presentword.equals(endWord)) return count;

            for(int i =0;i<presentword.length();i++){
                char chars[] = presentword.toCharArray();
                for(char j = 'a';j<='z';j++){
                    if(chars[i]==j) continue;
                    chars[i] = j;

                    String newword = new String(chars);

                   if(!visited.contains(newword) && set.contains(newword)){
                     
                        visited.add(newword);
                        q.add(new pair(newword,count+1));
                    }
                   
                    

                }
            }

        }
        return 0;







        
    }
}