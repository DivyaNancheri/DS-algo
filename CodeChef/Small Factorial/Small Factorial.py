import sys
sys.stdout = open('CodeChef/Small Factorial/output.txt', 'w')
sys.stdin = open('CodeChef/Small Factorial/input.txt', 'r')

tc=int(input())
while(tc>0):
    
    n=int(input())
    p=1
    for i in range(1,n+1):
        p=p*i
    print(p)
    tc-=1

# YES expected