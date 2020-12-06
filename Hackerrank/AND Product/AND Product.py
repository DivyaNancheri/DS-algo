import sys
sys.stdout = open('Hackerrank/AND Product/output.txt', 'w')
sys.stdin = open('Hackerrank/AND Product/input.txt', 'r')

def checkBit(n,i):
    if((n>>i)&1== 1):
        return True
    return False
tc = int(input())
while(tc>0):
    a,b = [int(x) for x in input().split()]
    diff=b-a
    sum=0
    for i in range(0,32):
        
        if(checkBit(a,i) and checkBit(b,i) and 1<<i > diff):
            # print("in if 1")
            sum+=1<<i
        
    print(sum)
        
    tc-=1