class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;

        int l = 0;
        int r = n - 1;

        int boats = 0;

        while(l <= r) {
            int w = people[l] + people[r];

            if(w > limit) {
                boats++;
                r--;
            } else {
                boats++;
                r--;
                l++;
            }
        }


        return boats;
    }
}