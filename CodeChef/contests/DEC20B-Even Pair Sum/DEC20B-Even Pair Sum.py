import sys
sys.stdout = open('CodeChef/contests/DEC20B-Even Pair Sum/output.txt', 'w')
sys.stdin = open('CodeChef/contests/DEC20B-Even Pair Sum/input.txt', 'r')



tc=int(input())
for i in range(tc):
    a,b = [int(i) for i in input().split()]
    xe=0
    xo=0
    ye=0
    yo=0
    for x in range(1,a+1):
        if(x%2==0):
            xe+=1
        else:
            xo+=1
    print(xo)
    for y in range(1,b+1):
        if(y%2==0):
            ye+=1
        else:
            yo+=1
            
    print(xe*ye+xo*yo)
    

#     input
#     4
# 1 1
# 2 3
# 4 6
# 8 9

TLE