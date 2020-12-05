import sys
sys.stdout = open('testing/output.txt', 'w')
sys.stdin = open('testing/input.txt', 'r')

for i in range(int(input())):
    n = int(input())
    l=list(map(int,input().split()))
    d=l[0]
    k=1
    sum=0
    for j in range(1,n+1):
        sum = 2*sum + 2*d*l[j]%1000000007
        d=d+k*l[j]%1000000007
        k=(k*2)%1000000007
    final_sum=sum%1000000007
    print(final_sum)
    

    
     
     
            
    


#  expected
# AP 13
# GP 54