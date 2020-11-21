import sys
sys.stdout = open('CodeChef/SecondLargest/output.txt', 'w')
sys.stdin = open('CodeChef/SecondLargest/input.txt', 'r')

tc=int(input())
while(tc>0):
    x= [int(i) for i in input().split()]
    x.sort()
    print(x[len(x)-2])
    
    tc-=1