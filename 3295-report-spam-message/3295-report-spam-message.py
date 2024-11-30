class Solution:
    def reportSpam(self, message: List[str], bannedWords: List[str]) -> bool:
        map={bannedWords[i]:True for i in range(len(bannedWords))}
        c=0
        for i in message:
            if i in map:
                c+=1
                
        return c>=2