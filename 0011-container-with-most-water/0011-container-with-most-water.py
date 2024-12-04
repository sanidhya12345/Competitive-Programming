#this problem will be solved using two pointers approach
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        mxarea=-10**9+7
        while left<right:
            w=right-left   #no.of elements considered=width
            h=min(height[left],height[right]) #min height from left index and right index
            area=w*h
            mxarea=max(area,mxarea)
            if height[left]<height[right]:
                left+=1
            elif height[right]<height[left]:
                right-=1
            else:
                left+=1
                right-=1
        return mxarea
            