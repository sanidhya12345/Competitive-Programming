class Solution:
    def maximumLength(self, s: str) -> int:
        def checkAllCharSame(s):
            for i in range(0,len(s)-1):
                if s[i]!=s[i+1]:
                    return False
            return True
        def solve(s): #as the testcases are small so simply go for bruteforce
            l=[] #stores all the possible substring of the main string
            for i in range(0,len(s)):
                for j in range(0,len(s)):
                    if s[i:j+1]!='':
                        l.append(s[i:j+1])
            map={l[i]:0 for i in range(len(l))}
            for i in l:
                map[i]+=1
            
            max_len=0
            for i in map.keys():
                if map[i]>=3 and checkAllCharSame(i):
                    max_len=max(max_len,len(i))
            if max_len==0:
                return -1
            return max_len
        return solve(s)