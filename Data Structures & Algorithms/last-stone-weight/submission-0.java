class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones) {
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 0) {

            if(maxHeap.size() == 1) {
                return maxHeap.peek();
            }
            int s1 = maxHeap.poll();
            int s2 = maxHeap.poll();

            if(s1 > s2) {
                int newStone = Math.abs(s1 - s2);
                maxHeap.offer(newStone);
            }
        }

        return (maxHeap.size() == 0) ? 0 : maxHeap.peek();
    }
}
