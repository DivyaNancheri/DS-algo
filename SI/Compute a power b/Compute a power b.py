import sys
sys.stdout = open('SI/Compute a power b/output.txt', 'w')
sys.stdin = open('SI/Compute a power b/input.txt', 'r')

t=int(input())
m=1000000007
for i in range(t):
    a,b=map(int,input().split())
    ans=1
    x=a
    while(b!=0):
        if(b%2==1):
            ans=(ans*x)%m
        x=(x*x)%m
        b=b>>1

    print(ans)


# using recursion
# to avoid RecursionError: maximum recursion depth exceeded in comparison
import sys 
sys.setrecursionlimit(10**6) 

def f(a,n):
    if(n==0):
        return 1
    k=f(a,int(n/2)) # here without int faced TypeError: unsupported operand type(s) for *: 'NoneType' and 'NoneType'
    if(n%2==0):
        return  (k * k)%m
    if(n%2==1):
        return (k * k * a)%m
    
t=int(input())
m=1000000007    
for i in range(t):
    a,n=map(int,input().split())
    ans=f(a,n)
    print(ans%m)