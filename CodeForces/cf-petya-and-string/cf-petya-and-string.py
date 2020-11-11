import sys
sys.stdout = open('CodeForces/cf-petya-and-string/output.txt', 'w')
sys.stdin = open('CodeForces/cf-petya-and-string/input.txt', 'r')

tc=int(input())
while(tc>0):
    
    s=input()
    l=s.split('+')
    l.sort()
    res="+"
    print(res.join(l))
    
    tc=tc-1



# 1+2+3 expected