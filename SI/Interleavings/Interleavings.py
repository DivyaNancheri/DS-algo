import sys
sys.stdout = open('SI/Interleavings/output.txt', 'w')
sys.stdin = open('SI/Interleavings/input.txt', 'r')

def interleavings(a, b, ans, m, n, idx) :
    if(m==0 and n==0):
        print("".join(ans))
        return 
    if(m != 0) :
        ans[idx] = a[0]
        interleavings(a[1:], b, ans, m-1, n, idx+1)
    
    if(n != 0) :
        ans[idx] = b[0]
        interleavings(a, b[1:], ans, m, n-1, idx+1)
    

tc=int(input())
k=1
while(tc>0):
    
    a,b=[i for i in input().split()]
    m=len(a)
    n=len(b)
    idx=0
    ans = [''] * (m+n)
    print('Case #',k,':',sep='')
    interleavings(a,b, ans, m, n, idx)
    
    k+=1
    tc=tc-1
