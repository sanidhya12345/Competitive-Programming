from itertools import permutations
class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        s=set()
        perm=permutations(nums)
        for i in perm:
            s.add(i)
        l=[]
        for i in s:
            l.append(list(i))
        return l