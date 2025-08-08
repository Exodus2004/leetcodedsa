class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        Map<String, Integer> wordMap = new HashMap<>();
        int n = words.length;
        
        // Build the map: word -> index
        for (int i = 0; i < n; i++) {
            wordMap.put(words[i], i);
        }
        
        for (int i = 0; i < n; i++) {
            String s = words[i];
            for (int k = 0; k <= s.length(); k++) {
                String left = s.substring(0, k);
                String right = s.substring(k);
                
                // Case 1: left is palindrome
                if (isPalindrome(left)) {
                    String reversedRight = new StringBuilder(right).reverse().toString();
                    if (wordMap.containsKey(reversedRight)) {
                        int j = wordMap.get(reversedRight);
                        if (j != i) {
                            res.add(Arrays.asList(j, i));
                        }
                    }
                }
                
                // Case 2: right is non-empty palindrome
                if (!right.isEmpty() && isPalindrome(right)) {
                    String reversedLeft = new StringBuilder(left).reverse().toString();
                    if (wordMap.containsKey(reversedLeft)) {
                        int j = wordMap.get(reversedLeft);
                        if (j != i) {
                            res.add(Arrays.asList(i, j));
                        }
                    }
                }
            }
        }
        return res;
    }
    
    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}