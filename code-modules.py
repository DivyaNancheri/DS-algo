def checkBit(n,i):
    if((n>>i)&1== 1):
        return True
    return False

def sumOfSubsets(a,n,k):
    for i in range(1,(1<<n)+1):
        sum=0
        for j in range(0,n):
            if((i>>j)&1 == 1):
                sum = sum + a[j]
        if(sum==k):
            return 'YES'
    return 'NO'

