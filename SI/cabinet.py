import sys
sys.setrecursionlimit(10**6)

ans = sys.maxsize


def cabinetPartition(a,n,idx,k,maxCost):
    print("in rec call: maxcost=",maxCost)
    print("in rec call: k=",k)
    print("in rec call: ans=",ans)


    if(k==1):
        print("  in k==1  ")
        cost=0
        for i in range(idx, n):
            cost+=a[i]
        maxCost = max(maxCost,cost)
        print("maxCost=",maxCost)
        ans = min(ans, maxCost)

    cost=0
    for i in range(idx,n):
        cost+=a[i]
        print("cost=",cost,"maxcost=",maxCost)
        cabinetPartition(a,n,i+1,k-1,max(cost,maxCost))
    
    
    
tc=int(input())
for i in range(tc):
    n,k = [int(i) for i in input().split()]
    a = [int(i) for i in input().split()]
    cabinetPartition(a,n,0,k,0)
    print(ans)