import sys
sys.stdout = open('testing/output.txt', 'w')
sys.stdin = open('testing/input.txt', 'r')

sys.setrecursionlimit(10**6) 

def f(a,n):
    if(n==0):
        return 1
    k=f(a,int(n/2))
    if(n%2==0):
        return  k * k
    if(n%2==1):
        return k * k * a
    
t=int(input())
m=1000000007    
for i in range(t):
    a,n=map(int,input().split())
    ans=f(a,n)
    print(ans%m)
    
     
     
            
    


#  expected
# AP 13
# GP 54