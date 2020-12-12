class Solution:
    # @param A : list of integers
    # @param B : integer
    # @return an integer
    def diffPossible(self, a, B):
        a.sort()
        n=len(a)
        i=0
        j=1
        while(i<n and j<n):
            diff=a[j]-a[i]
            if(i!=j and diff == B):  
                return 1
            elif(diff > B):
                i+=1
            else:
                j+=1
        return 0