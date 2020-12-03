import sys
sys.stdout = open('CodeChef/The Lead Game/output.txt', 'w')
sys.stdin = open('CodeChef/The Lead Game/input.txt', 'r')

n=int(input())
p=0
lead=0
cb=0
while(n>0):
    a,b= [int(i) for i in input().split()]
    if(a>b):
        ca=a-b
        if(ca>lead):
            lead=ca
            p=1
        
    elif(b>a):
        cb=b-a
        if(cb>lead):
            lead=cb
            p=2
        
    n-=1
        
print(p,lead)

    