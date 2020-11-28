import sys
sys.stdout = open('SI/Subset Sum Problem/output.txt', 'w')
sys.stdin = open('SI/Subset Sum Problem/input.txt', 'r')

def subsetSum(a,n,k):
    for i in range(1,(1<<n)+1):
        sum=0
        for j in range(0,n):
            if((i>>j)&1 == 1):
                sum = sum + a[j]
        if(sum==k):
            return 'YES'
    return 'NO'

tc = int(input())
for i in range(tc):
    n,k = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    
    print(subsetSum(a,n,k))
    
    
# TC : 2^n * n      SC: 1
# for n=100 t= 100
# 2^100= 10^30
# TC: 10^30 * 100 * 100 > 10^8 so TLE
# further optimise with DP

    
# using recursion
def subsetSum(a,n,sum,i,k):
    if(i==n):
        return sum==k
    return subsetSum(a,n,sum+a[i],i+1,k) or subsetSum(a,n,sum,i+1,k)

tc = int(input())
for i in range(tc):
    n,k = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]
    sum=0
    i=0
    if(subsetSum(a,n,sum,i,k)==True):
        print('YES')
    else:
        print('NO')
        
# TC : 2^n * n      SC: 1
# for n=100 t= 100
# 2^100= 10^30
# TC: 10^30 * 100 * 100 > 10^8 so TLE
# further optimise with DP
        