import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Use a PriorityQueue (Min Heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the min heap
        for (int element : nums) {
            minHeap.offer(element);

            // Keep the size of the heap <= k
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }

        // The root of the heap will be the kth largest element
        return minHeap.peek();
    }
}
