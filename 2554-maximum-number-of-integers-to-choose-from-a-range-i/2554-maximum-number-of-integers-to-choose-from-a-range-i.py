class Solution:
    def maxCount(self, banned: List[int], n: int, maxsum: int) -> int:
        banned_set = set(banned) #set will give O(1) TC for lookups
        sm = 0
        count = 0
        
        for i in range(1, n + 1):
            if i not in banned_set and sm + i <= maxsum:
                sm += i
                count += 1
            elif sm + i > maxsum:
                break  
        
        return count