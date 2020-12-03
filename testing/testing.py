import sys
sys.stdout = open('testing/output.txt', 'w')
sys.stdin = open('testing/input.txt', 'r')

sys.setrecursionlimit(10**6) 


n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
a.sort()
for i in range(0,n):
    print(a[i])

    
     
     
            
    


#  expected
# AP 13
# GP 54