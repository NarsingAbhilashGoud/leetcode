
public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        int left = 0, right = height.length - 1;
        int left_max = 0, right_max = 0;
        int trappedWater = 0;
        
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left]; // Update left_max
                } else {
                    trappedWater += left_max - height[left]; // Water trapped at left
                }
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right]; // Update right_max
                } else {
                    trappedWater += right_max - height[right]; // Water trapped at right
                }
                right--;
            }
        }
        
        return trappedWater;
    }
}