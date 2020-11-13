import sys
sys.stdout = open('CodeForces/word/output.txt', 'w')
sys.stdin = open('CodeForces/word/input.txt', 'r')

tc=int(input())
while(tc>0):
    
    s=input()
    low=0
    up=0
    for i in s:
        if(i.islower()):
            low+=1
        if(i.isupper()):
            up+=1
    if(low>up):
        print(s.lower())
    elif(up>low):
        print(s.upper())
    elif(up==low):
        print(s.lower())
    
    tc=tc-1



# house expected