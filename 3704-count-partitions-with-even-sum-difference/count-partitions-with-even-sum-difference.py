class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        right = sum(nums)
        left = 0
        count = 0
        for i in range(len(nums) - 1):
            left += nums[i]
            right -= nums[i]
            if abs(right - left) % 2 == 0:
                count += 1
        return count