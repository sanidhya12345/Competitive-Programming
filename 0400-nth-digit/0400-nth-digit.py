class Solution:
    def findNthDigit(self, n: int) -> int:
        len=1
        count=9
        
        while n>len*count:
            n-=len*count
            len+=1
            count*=10
        start_num=10**(len-1)
        num,remainder=divmod(n,len)
        
        if remainder==0:
            return int(str(start_num+num-1)[-1])
        else:
            return int(str(start_num+num)[remainder-1])