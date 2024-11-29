import itertools
from collections import Counter
class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        b=list(itertools.chain.from_iterable(nums))
        c=Counter(b)
        max_value=max(c.values())
        l=[]
        if max_value==len(nums):
            for i in c.keys():
                if c.get(i)==max_value:
                    l.append(i)
            l.sort()
        return l