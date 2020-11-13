import sys
sys.stdout = open('CodeForces/122A-LuckyDivision/output.txt', 'w')
sys.stdin = open('CodeForces/122A-LuckyDivision/input.txt', 'r')

# tc=int(input())
# while(tc>0):
    
n=int(input())
temp=n
flag=0
count=0
luck=0
if(temp%4==0 or temp%7==0 or temp%44==0 or temp%47==0 or temp%74==0 or temp%74==0 or 
   temp%444==0 or temp%447==0 or temp%474==0 or temp%477==0 or temp%744==0 or temp%747==0
   or temp%774==0 or temp%777==0):
    print("YES")
else:
    print("NO")
    

# YES expected