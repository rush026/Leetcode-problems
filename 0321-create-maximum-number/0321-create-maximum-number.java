class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int n = nums1.length, m = nums2.length;
        int[] best = new int[k];
        
        // try every split
        for (int i = Math.max(0, k - m); i <= Math.min(k, n); i++) {
            int[] seq1 = maxSubsequence(nums1, i);
            int[] seq2 = maxSubsequence(nums2, k - i);
            int[] candidate = merge(seq1, seq2, k);
            if (greater(candidate, 0, best, 0)) {
                best = candidate;
            }
        }
        return best;
    }

    
    private int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] stack = new int[k];
        int top = -1, remain = n;
        for (int num : nums) {
            while (top >= 0 && stack[top] < num && remain > k - top - 1) {
                top--;
            }
            if (top + 1 < k) {
                stack[++top] = num;
            }
            remain--;
        }
        return stack;
    }

   
    private int[] merge(int[] nums1, int[] nums2, int k) {
        int[] merged = new int[k];
        int i = 0, j = 0, r = 0;
        while (r < k) {
            if (greater(nums1, i, nums2, j)) {
                merged[r++] = i < nums1.length ? nums1[i++] : 0;
            } else {
                merged[r++] = j < nums2.length ? nums2[j++] : 0;
            }
        }
        return merged;
    }

    
    private boolean greater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        if (j == nums2.length) return true;
        if (i < nums1.length && nums1[i] > nums2[j]) return true;
        return false;
    }
}
