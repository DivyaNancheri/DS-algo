import sys
sys.stdout = open('Hackerrank/Recursive Digit Sum/output.txt', 'w')
sys.stdin = open('Hackerrank/Recursive Digit Sum/input.txt', 'r')
sys.setrecursionlimit(10**6)

def sum(n):
    if(n==0):
        return 0
    d=n % 10 + sum(int(n / 10))
    return d

def recSum(n):
    if(n//10==0):
        return n
    sum=0
    
    while(n!=0):
        sum=sum+n%10
        n=n//10

    return recSum(sum)%

def recSum(n):
    sum = 0
    for i in n:
        sum += int(i)
    if sum < 10:
        return sum
    return recSum(str(sum))

n,k = [int(x) for x in input().split()]
res=sum(n)
res=res*k
print(recSum(str(res)))




# the below logic fails when k=10 n=593
# def sum(n):
#     if(n==0):
#         return 0
#     d=n % 10 + sum(int(n / 10))
#     print('n=',n,'d=',d)
#     return d

# n,k = [x for x in input().split()]

# k=int(k)
# print(k)
# p=''
# for i in range(k):
#     p+=n
# p=int(p)

# print('out=',p)
# res=sum(p)
# print('res=',res)
# # while(len(str(res))!=1):
    
#     # print('1=',res)
#     # res=sum(res)
#     # print('2=',res)
    

# print(res)
    

