class Solution:
    # @param A : list of integers
    # @return an integer
    def nTriang(self, a):
        m=1000000007
        count=0
        n=len(a)
        a.sort()    
        for i in range(n - 1, 0, -1): 
            p1 = 0
            p2 = i - 1;
            while(p1 < p2): 
                if(a[p1]+a[p2]>a[i]): 
                    count+=(p2-p1)%m
                    p2-=1  
                else: 
                    p1+=1
        return int(count%1000000007)