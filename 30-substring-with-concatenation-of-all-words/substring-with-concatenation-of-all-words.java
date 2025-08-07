class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int size = 0;
        int x = words[0].length();
        size = x * words.length;
        
        HashMap<String,Integer> map = new HashMap<>();
        for(String p: words){
            map.put(p,map.getOrDefault(p,0)+1);
        }
        
        
        
        
        
        for (int i = 0; i < x; i++) {
            int l = i;
            int r = i;
            int n = s.length();
            HashMap<String,Integer> window = new HashMap<>();
            
            while(r <= n - x){
                String q = s.substring(r, r + x);
                window.put(q, window.getOrDefault(q, 0) + 1);
                
                while(r - l + 1 > size){
                    String leftWord = s.substring(l, l + x);
                    window.put(leftWord, window.get(leftWord) - 1);
                    
                    if(window.get(leftWord) == 0) window.remove(leftWord);
                    
                    l = l + x;
                }
                
                if(check(window, map)) res.add(l);
                
                r = r + x;
            }
        }
        return res;
    }
    
    boolean check(HashMap<String,Integer> a, HashMap<String,Integer> b){
        if(a.size() != b.size()) return false;
        for(String s : a.keySet()){
            if(!b.containsKey(s)) return false;
            
            int x = a.get(s);
            int y = b.get(s);
            if(x != y) return false;
        }
        return true;
    }
}








// public class Solution {
//     public List<Integer> findSubstring(String s, String[] words) {
//         List<Integer> result = new ArrayList<>();
//         if (s.length() == 0 || words.length == 0) return result;

//         int wordLen = words[0].length();
//         int wordCount = words.length;
//         int totalLen = wordLen * wordCount;

//         // Frequency map of the words
//         HashMap<String, Integer> wordMap = new HashMap<>();
//         for (String word : words) {
//             wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
//         }
//         System.out.println(wordMap);

//         // Slide over s in wordLen different offsets to cover all alignment cases
//         for (int i = 0; i < wordLen; i++) {
//             int left = i, right = i, count = 0;
//             HashMap<String, Integer> windowMap = new HashMap<>();

//             while (right + wordLen <= s.length()) {
//                 String word = s.substring(right, right + wordLen);
//                 right += wordLen;

//                 if (wordMap.containsKey(word)) {
//                     windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
//                     count++;

//                     // If word occurs too many times, shrink window from left
//                     while (windowMap.get(word) > wordMap.get(word)) {
//                         String leftWord = s.substring(left, left + wordLen);
//                         windowMap.put(leftWord, windowMap.get(leftWord) - 1);
//                         left += wordLen;
//                         count--;
//                     }

//                     // If all words matched
//                     if (count == wordCount) {
//                         result.add(left);
//                     }
//                 } else {
//                     // Reset window
//                     windowMap.clear();
//                     count = 0;
//                     left = right;
//                 }
//             }
//         }

//         return result;
//     }
// }
