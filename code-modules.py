tc = int(input())
for i in range(tc):
    n,k = [int(x) for x in input().split()]
    a = [int(x) for x in input().split()]

# to avoid RecursionError: maximum recursion depth exceeded in comparison
import sys 
sys.setrecursionlimit(10**6)

# to avoid Unsupported operand type(s) for *: 'NoneType' and 'NoneType' (Python)
int()
def checkBit(n,i):
    if((n>>i)&1== 1):
        return True
    return False

def sumOfSubsets(a,n,k):
    for i in range(1,(1<<n)+1):
        sum=0
        for j in range(0,n):
            if((i>>j)&1 == 1):
                sum = sum + a[j]
        if(sum==k):
            return 'YES'
    return 'NO'

