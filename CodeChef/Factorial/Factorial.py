import sys
sys.stdout = open('CodeChef/Factorial/output.txt', 'w')
sys.stdin = open('CodeChef/Factorial/input.txt', 'r')

tc=int(input())
while(tc>0):
    
    n=int(input())
    c=0
    i=5
    while(n//i):
        c+=n//i
        i=i*5
    print(c)
    
    tc-=1

# YES expected