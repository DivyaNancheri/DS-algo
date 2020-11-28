import sys
sys.stdout = open('testing/output.txt', 'w')
sys.stdin = open('testing/input.txt', 'r')

t=int(input())
for i in range(t):
    n=int(input())
    a = [int(i) for i in input().split()]
    l=a[0]
    for i in range(1,n):
        l=l+a[i]
    print(l)
    
     
     
            
    


#  expected
# AP 13
# GP 54