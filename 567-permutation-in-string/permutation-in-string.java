class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        // Build frequency map of s1
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int r = 0;

        while (r < s2.length()) {
            // Add s2[r] to window
            char rightChar = s2.charAt(r);
            window.put(rightChar, window.getOrDefault(rightChar, 0) + 1);

            // Check if current window has the target length
            if (r - l + 1 == s1.length()) {
                // Check if it's an anagram of s1
                if (fun(map, window)) {
                    return true;
                }

                // Remove leftmost character from window
                char leftChar = s2.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
                l++; // shrink window
            }

            r++;
        }

        return false;
    }

    // Check if window has same frequency as s1
    boolean fun(Map<Character, Integer> map, Map<Character, Integer> window) {
        if (map.size() != window.size()) return false;
        for (char c : map.keySet()) {
            if (!window.containsKey(c) || !map.get(c).equals(window.get(c))) {
                return false;
            }
        }
        return true;
    }
}