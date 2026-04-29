class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        int ele = nums[0];

        for(int i=1; i<n; i++) {
            if(ele == nums[i]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                ele = nums[i];
                count = 1;
            }
        }

        count = 0;
        for(int num:nums) {
            if(num == ele) count++;
        }

        return (n/2 < count) ? ele : -1 ;
    }
}