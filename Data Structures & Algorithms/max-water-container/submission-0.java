class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        int low=0;
        int high=n-1;
        while(low<high){
            int h=Math.min(heights[low], heights[high]);
            int w=high-low;
            maxArea=Math.max(maxArea, h*w);
            if(heights[low]<heights[high]){
                low++;
            } else{
                high--;
            }
        }
        return maxArea;
    }
}
