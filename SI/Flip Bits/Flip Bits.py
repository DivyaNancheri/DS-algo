import sys
sys.stdout = open('SI/Flip Bits/output.txt', 'w')
sys.stdin = open('SI/Flip Bits/input.txt', 'r')

t=int(input())
for i in range(t):
    a,b = [int(x) for x in input().split()]
    x=a^b
    c=0
    while(x>0):
        if(x&1==1):
            c+=1
        x=x>>1
    print(c)
