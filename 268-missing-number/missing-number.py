class Solution:
    def missingNumber(self, nums: List[int]) -> int:
            
        nums.sort()
        s=nums[-1]
        x=[i for i in range(len(nums)+1)]
        for i in x:
            if i not in nums :
                return i


