import sys
sys.stdout = open('SI/Repeated Numbers/output.txt', 'w')
sys.stdin = open('SI/Repeated Numbers/input.txt', 'r')

t=int(input())
for i in range(t):
    n=int(input())
    a = [int(i) for i in input().split()]
    count=0
    a.sort()    
    for i in range(0,n):
        count=0
        j=i+1
        while(count!=1):
            if(a[i]==a[j]):
                count+=1
                print(a[i],end=' ')
    print('')

    
