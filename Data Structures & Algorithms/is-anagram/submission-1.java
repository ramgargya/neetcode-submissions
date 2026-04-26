class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n != m)
            return false;

        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int n = s.length();
//         int m = t.length();

//         if(n != m) return false;

//         int[] s1 = new int[26];
//         int[] s2 = new int[26];

//         for(int i=0; i<n; i++) {
//             s1[s.charAt(i) - 'a']++;
//             s2[t.charAt(i) - 'a']++;
//         }

//         for(int i=0; i<26; i++) {
//             if(s1[i] != s2[i]) return false;
//         }

//         return true;
//     }
// }
