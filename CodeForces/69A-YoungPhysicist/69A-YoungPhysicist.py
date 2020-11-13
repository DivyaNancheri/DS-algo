import sys
sys.stdout = open('CodeForces/69A-YoungPhysicist/output.txt', 'w')
sys.stdin = open('CodeForces/69A-YoungPhysicist/input.txt', 'r')

tc=int(input())
xtotal=0
ytotal=0
ztotal=0
while(tc>0):
    
    x = [int(i) for i in input().split()]
    xtotal += x[0] 
    ytotal += x[1] 
    ztotal += x[2] 
    
    tc=tc-1

if(xtotal==0 and ytotal==0 and ztotal==0):
    print("YES")
else:
    print("NO")


# 1+2+3 expected