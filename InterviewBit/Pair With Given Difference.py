def solve(self, a, B):
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
    

#here the reason of keeping i!=j
# consider scenario 
# l=[1,2,3,4,5] k=0
# i=0 a[i]=1
# j=1 a[j]=2 diff=1 > 0 so i becomes 1
# a[i]=2 a[j]=2 to avoid this we need i!=j
# if we dont keep 