import sys
sys.stdout = open('SPOJ/PALIN - The Next Palindrome/output.txt', 'w')
sys.stdin = open('SPOJ/PALIN - The Next Palindrome/input.txt', 'r')


tc = int(input())

while(tc>0):
    n=int(input())
    
    tc-=1
    

def checkPalin(n):
    r=0
    temp=n
    while(n>0):
        r=r*10+n%10
        n=n/10
    print(r)
    if(r==temp):
        return True
    else:
        return False
    



while tc>0:
    
    n=int(input())
    print("n=",n)
    while(True):
        n=n+1
        print("in 1st while:n=",n)
        res=checkPalin(n)
        if(res==True):
            print(n)
            break
        
    tc-=1


#  expected
# AP 13
# GP 54