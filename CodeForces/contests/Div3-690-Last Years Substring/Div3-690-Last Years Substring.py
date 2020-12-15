import sys
sys.stdout = open('CodeForces/contests/Div3-690-Last Years Substring/output.txt', 'w')
sys.stdin = open('CodeForces/contests/Div3-690-Last Years Substring/input.txt', 'r')


tc=int(input())

while(tc>0):
    n=int(input())
    s=input()
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
# 8
# 20192020
# 8
# 22019020
# 4
# 2020
# 5
# 20002
# 6
# 729040
# 6
# 200200