class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> counts = new HashMap<>();
        for (int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (int x = 0; x < t.length(); x++) {
            char c = t.charAt(x);
            counts.put(c, counts.getOrDefault(c, 0) - 1);
        }

        for (int x : counts.values()) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
}