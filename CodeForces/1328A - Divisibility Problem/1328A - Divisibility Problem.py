import sys
sys.stdout = open('CodeForces/479A - Expression/output.txt', 'w')
sys.stdin = open('CodeForces/479A - Expression/input.txt', 'r')

tc=int(input())
 
while(tc>0):
    
    a,b = [int(i) for i in input().split()]
    if(a%b==0):
        print(0)
    else:
        print(b-a%b)
    
    tc=tc-1

# this givs TLE
# tc=int(input())

# while(tc>0):
    
#     a,b = [int(i) for i in input().split()]
#     count=0
#     while((a%b) !=0):
#         count+=1
#         a+=1
        
#     print(count)
    
#     tc=tc-1

# 5
# 10 4
# 13 9
# 100 13
# 123 456
# 92 46