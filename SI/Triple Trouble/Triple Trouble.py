import sys
sys.stdout = open('SI/Triple Trouble/output.txt', 'w')
sys.stdin = open('SI/Triple Trouble/input.txt', 'r')

t=int(input())
for i in range(t):
    n=int(input())
    a = [int(i) for i in input().split()]
    count=0
    ans=0
    for i in range(0,4):
        count=0
        for j in range(0,len(a)):
            # print('a[',j,']=',a[j],end=' ')
            # print('i',i,end=' ')
            if(((a[j]>>i)&1)==1):
                # print("inisde if,i=",i, end=' ')
                count+=1
                # print('count=',count)
        # print('count=',count)
        if(count%3 !=0):
            # print("inisde count if,i=",i)
            ans=ans+ (1<<i)
            # print("inisde count if,ans=",ans)
    print(ans)

    
