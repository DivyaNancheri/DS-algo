import sys
sys.stdout = open('CodeChef/contests/NOVCookOff-FliptheString/output.txt', 'w')
sys.stdin = open('CodeChef/contests/NOVCookOff-FliptheString/input.txt', 'r')

# cook your dish here
tc= int(input())

def subString(s, n):
    for i in range(n):
            for len in range(i+1,n+1):
                print(s[i: len])
                
while tc>0:
    a= input()
    b= input()
    count=0
    if(a==b):
        break
    else:
        count+=1
        subString(a,len(a))
        
    print('count=',count)
    
    tc-=1
        
     
     
            
    


# 3
# 100001
# 110111
# 1010
# 1010
# 000
# 111