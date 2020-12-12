t=int(input())
for i in range(t):
    n=int(input())
    a = [int(i) for i in input().split()]
    count=0
    a.sort()    
    for i in range(n - 1, 0, -1): 
        p1 = 0
        p2 = i - 1;
        while(p1 < p2): 
            if(a[p1]+a[p2]>a[i]): 
                count+=p2-p1
                p2-=1  
            else: 
                p1+=1
    print(count)