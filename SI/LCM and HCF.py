tc= int(input())
while(tc>0):
    a,b = [int(x) for x in input().split()]
    def gcd(a,b):
        if(a==0):
            return b
        return gcd(b%a,a)
    
    g = gcd(a,b)
    l=(a*b)//g
    print(l,g,sep=' ')
    
    tc-=1