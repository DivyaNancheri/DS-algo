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
