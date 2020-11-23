import sys
sys.stdout = open('CodeChef/contests/NOVCookOff-FliptheString/output.txt', 'w')
sys.stdin = open('CodeChef/contests/NOVCookOff-FliptheString/input.txt', 'r')

# cook your dish here
tc= int(input())

# def subString(s, n):
#     for i in range(n):
#             for len in range(i+1,n+1):
#                 print(s[i: len])
                
while tc>0:
    a= input()
    b= input()
    count=0
    res=''
    i=0
     
    for i in range(0,len(a)):
       if(a[i]==b[i] and a[i]!='0'):
            res[i]=i

    # while i<len(a):
    #     if(a[i]==b[i] and a[i]!='0'):
    #         res[i]=i
    #     else:
    #         res[i]='-1'
    print(res)
    # while(a!=b):
        
    #     count+=1
        
        # subString(a,len(a))
        
    print('count=',count)
    
    tc-=1
        
     
     
            
    


# 3
# 100001
# 110111
# 1010
# 1010
# 000
# 111