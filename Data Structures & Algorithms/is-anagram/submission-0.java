class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();
        for (int x = 0; x < s.length(); x++) {
            Character charCheckS = s.charAt(x);
            if (sCount.get(charCheckS) != null) {
                int incrementS = sCount.get(charCheckS) + 1;
                sCount.put(charCheckS, incrementS);
            } else {
                sCount.put(charCheckS, 1);
            }

            Character charCheckT = t.charAt(x);
            if (tCount.get(charCheckT) != null) {
                int incrementT = tCount.get(charCheckT) + 1;
                tCount.put(charCheckT, incrementT);
            } else {
                tCount.put(charCheckT, 1);
            }
        }

        if (sCount.size() != tCount.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : sCount.entrySet()) {
            Character key = entry.getKey();
            if (!tCount.containsKey(key)) {
                return false;
            }
            Integer count = tCount.get(key);
            if (count == null) {
                return false;
            }
            if (!count.equals(entry.getValue())) {
                return false;
            }
        }
        return true;
    }
}