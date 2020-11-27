t=int(input())
for i in range(t):
    n=int(input())
    while((n%2)!=1):
        n=n//2
    if(n==1):
        print("True")
    else:
        print("False")