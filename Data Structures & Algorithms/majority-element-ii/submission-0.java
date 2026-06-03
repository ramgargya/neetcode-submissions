class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int n1 = -1;
        int n2 = -1;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0; i<n; i++) {
            if(n1 == nums[i]) cnt1++;
            else if (n2 == nums[i]) cnt2++; 
            else if(cnt1 == 0) {
                cnt1 = 1;
                n1 = nums[i];
            } else if (cnt2 == 0) {
                cnt2 = 1;
                n2 = nums[i];
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int num : nums) {
            if(num == n1) cnt1++;
            else if(num == n2) cnt2++;
        }

        List<Integer> res = new ArrayList<>();

        if(cnt1 > n/3) res.add(n1);
        if(cnt2 > n/3) res.add(n2);

        return res;
    }
}