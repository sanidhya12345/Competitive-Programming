class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        ans=[]
        #loop over all the possiblities of subsets
        
        for mask in range(1<<n):
            
            #store the current subsequence results
            curr=[]
            
            for i in range(n):
                #check if the ith bit is set or not if it is set then add them into the current result otherwise not
                if mask & (1<<i):
                    curr.append(nums[i])
            ans.append(curr)
        return ans