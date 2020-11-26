import sys
sys.stdout = open('CodeForces/contests/Div3-686-Unique Bid Auction/output.txt', 'w')
sys.stdin = open('CodeForces/contests/Div3-686-Unique Bid Auction/input.txt', 'r')

from itertools import permutations 

tc=int(input())

while(tc>0):
    
    n=int(input())
    a = [int(i) for i in input().split()]
    index=sys.maxsize
    Dict = {}
    minVal=sys.maxsize
    
    for i in range(0,n):
        count=0
        for j in range(0,n):
            if(a[i]==a[j] and i!=j):
                count+=1
        if(count==0):
            Dict[i] = a[i]
            if(a[i]<minVal):
                minVal=a[i]
                index=i
    if(index==sys.maxsize):
        print('-1')
    else:
        print(index+1)
    tc=tc-1
    
    # res1 = not bool(Dict)
    # if(res1):
    #     print('-1')
    # else:
    #     temp = min(Dict.values())  
    #     for key, value in Dict.items(): 
    #         if temp == value: 
    #             print(key+1)
        # print(get_key(temp))   
        # res = [key for key in Dict if Dict[key] == temp]    
        # print(res)
             
     
    

# RTE in contest