t=int(input())
for i in range(t):
    n=int(input())
    a = [int(i) for i in input().split()]
    sum=0
    ex=0
    for i in range(0,n):
        sum=sum^a[i]
    for j in range(1,n+2):
        ex=ex^j
    print(sum^ex) 