import sys
sys.stdout = open('CodeForces/HQ9+/output.txt', 'w')
sys.stdin = open('CodeForces/HQ9+/input.txt', 'r')

s=input()
flag=0
for i in s:
    if(i=="H" or i=='Q' or i=='9' ):
        flag=1
        

if(flag==1):
    print("YES")
else:
    print("NO")


# 1+2+3 expected