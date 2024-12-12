class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        gifts.sort()
        n=len(gifts)
        for i in range(k):
            gifts[n-1]=int(gifts[n-1]**0.5)
            gifts.sort()
        return sum(gifts)