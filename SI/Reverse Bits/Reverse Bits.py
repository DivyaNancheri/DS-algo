import sys
sys.stdout = open('SI/Reverse Bits/output.txt', 'w')
sys.stdin = open('SI/Reverse Bits/input.txt', 'r')

t=int(input())
for i in range(t):
    n=int(input())
    l=bin(n)
    print(type(l))
    l=l[2:]
    list1=[] 
    list1[:0]=l
    print(type(list1))
    
    a[i]=n%2
    n=n/2
    i--
    
    list1.reverse()

    print(list1)

    # c=0
    # while(x>0):
    #     if(x&1==1):
    #         c+=1
    #     x=x>>1
    # print(c)

# 4
# 4
# 15
# 6
# 1000000000


# 536870912
# 4026531840
# 1610612736
# 5462492