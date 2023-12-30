package com.xworkz.codeninja;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            maxArea = Math.max(maxArea, h * width);

            // Move the pointers inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();

        // Example usage
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxWater = container.maxArea(height);

        System.out.println("Maximum water that can be trapped: " + maxWater);
    }
}

