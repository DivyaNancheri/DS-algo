import sys
sys.stdout = open('SPOJ/FCTRL2-Smallfactorials/output.txt', 'w')
sys.stdin = open('SPOJ/FCTRL2-Smallfactorials/input.txt', 'r')

tc=int(input())
while(tc>0):
    
    n=int(input())
    fact=1
    for i in range(1,n+1):
        fact=fact*i
    print(fact)
     
    tc=tc-1


#  expected
# 1
# 2
# 120
# 6