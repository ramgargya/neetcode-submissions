class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        int[] s1 = new int[26];
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);

            s1[c - 'a']++;
        }

        int[] s2 = new int[26];
        for(int i=0; i<m; i++) {
            char c = t.charAt(i);

            s2[c - 'a']++;
        }

        for(int i=0; i<26; i++) {
            if(s1[i] != s2[i]) return false;
        }

        return true;
    }
}
