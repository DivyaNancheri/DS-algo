import sys
sys.stdout = open('CodeForces/546A-SoldierandBananas/output.txt', 'w')
sys.stdin = open('CodeForces/546A-SoldierandBananas/input.txt', 'r')

k,n,w = [int(x) for x in input().split()]
total=0
for i in range(1,w+1):
    total+=k*i
diff=total-n
if(diff<0):
    print("0")
else:
    print(diff)


# 13 expected