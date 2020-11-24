import sys
sys.stdout = open('CodeForces/contests/Div3-686-Special Permutation/output.txt', 'w')
sys.stdin = open('CodeForces/contests/Div3-686-Special Permutation/input.txt', 'r')

from itertools import permutations 

tc=int(input())
 
while(tc>0):
 
    n=int(input())
    perm = permutations(range(1, n+1))
    result=[]
    for i in list(perm):  
        l=[]
        index=1
        for x in i:
            if(x!=index):
                l.append(x)
            index+=1
        if(len(l)==n):
            result=l
            print(result)
            break
 
    tc=tc-1
    
# WA for sample