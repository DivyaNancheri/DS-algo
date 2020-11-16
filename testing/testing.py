import sys
sys.stdout = open('testing/output.txt', 'w')
sys.stdin = open('testing/input.txt', 'r')

# cook your dish here
tc = int(input())
 
while tc>0:
    
    n=int(input())
    a = [int(i) for i in input().split()]
    if(n==1):
    	print(a[0])
    elif(n==2):
    	print(max(a[0], a[1]))
    elif(n==3):
    	a.sort() 
    	print(max(a[0]+a[1], a[2]))
    else:
    	a.sort() 
    	b1=max(a[0]+a[3],a[1]+a[2])
    	b2=max(a[3],a[1]+a[0]+a[2])
    	print(min(b1,b2))
    
    tc-=1
        
     
     
            
    


#  expected
# AP 13
# GP 54