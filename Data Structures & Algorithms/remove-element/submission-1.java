class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int idx = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] != val) {
                swap(nums, i, idx);
                idx++;
            }
        }

        return idx;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}