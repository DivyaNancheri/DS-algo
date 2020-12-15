import sys
sys.stdout = open('CodeForces/contests/Div3-690-Favorite Sequence/output.txt', 'w')
sys.stdin = open('CodeForces/contests/Div3-690-Favorite Sequence/input.txt', 'r')


tc=int(input())

while(tc>0):
    
    n=int(input())
    a = [int(i) for i in input().split()]
    l=(n-1)//2 
    i=0
    j=n-1
    if(n==1):
        print(a[0])
    elif(n==2):
        print(a[0],a[1])
    elif(n%2==0): #even length
        while(i<j):
            print(a[i],end=' ')
            print(a[j],end=' ')
            i+=1
            j-=1
        print(end='\n')
    else: #odd length
        while(i!=l):
            print(a[i],end=' ')
            print(a[j],end=' ')
            i+=1
            j-=1
        print(a[l])
    tc=tc-1
    
# 6
# 7
# 3 4 5 2 9 1 1
# 4
# 9 2 7 1
# 11
# 8 4 3 1 2 7 8 7 9 4 2
# 1
# 42
# 2
# 11 7
# 8
# 1 1 1 1 1 1 1 1