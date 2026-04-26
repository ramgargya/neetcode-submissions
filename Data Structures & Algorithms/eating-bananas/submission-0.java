class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxElement(piles);

        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            int hours = fun(piles, mid);

            if(hours > h) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;

    }

    // finding max element in the array
    private int maxElement(int[] a) {
        int max = Integer.MIN_VALUE;

        for(int num:a) {
            max = Math.max(max, num);
        }

        return max;
    }

    // calculating no. of hours to finish all bananas with the current speed
    private int fun(int[] a, int speed) {
        int hours = 0;

        for(int i=0; i<a.length; i++) {
            hours += Math.ceil( (double) a[i] / (double) speed);
        }

        return hours;
    }
}