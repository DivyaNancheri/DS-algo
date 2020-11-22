import sys
sys.stdout = open('CodeChef/contests/NOVCookOff-ChefandIPCCertificates/output.txt', 'w')
sys.stdin = open('CodeChef/contests/NOVCookOff-ChefandIPCCertificates/input.txt', 'r')

# cook your dish here
n,m,k = [int(x) for x in input().split()]
count=0

while n>0:
    a = [int(i) for i in input().split()]
    l=len(a)
    q=a[l-1]
    sum=0
    for i in range(0,l-1):
        sum+=a[i]
    
    if(sum>=m and q<=10):
        count+=1
    
    print("count=",count)
    n-=1

print(count)
        
     
     
            
    


#  expected
# AP 13
# # GP 54
# 4 8 4
# 1 2 1 2 5
# 3 5 1 3 4
# 1 2 4 5 11
# 1 1 1 3 12