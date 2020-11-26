import sys
sys.stdout = open('SI/Triple Trouble/output.txt', 'w')
sys.stdin = open('SI/Triple Trouble/input.txt', 'r')

t=int(input())
for i in range(t):
    n=int(input())
    a = [int(i) for i in input().split()]
    count=0
    for i in range(0,len(a)):
        count=0
        print("a[i]=",a[i],end=' ')
        for j in range(0,len(a)):
            if(a[i]==a[j] and i!=j):
                count+=1
        print("count=",count)
        if(count==0):
            print(a[i])
            break

    
