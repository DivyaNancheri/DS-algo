import sys
sys.stdout = open('CodeChef/contests/DEC20B-Vaccine Production/output.txt', 'w')
sys.stdin = open('CodeChef/contests/DEC20B-Vaccine Production/input.txt', 'r')

tc=int(input())
for i in range(tc):
    d1,v1,d2,v2,p= [int(i) for i in input().split()]
    sum=0
    samedays=0
    # if(d1==d2):
    #     sum=(v1+v2)
    #     print(sum)
    #     day=d1
    #     print(day)
    #     while(sum<p):
    #         sum+=sum
    #         day+=1
    #         print("day=",day,"sum=",sum)
    #     print(day)
    if(d1>d2):
        day=d2-1
        # print("day=",day)
        while(sum<p):
            sum+=v2
            if(d1==d2 or samedays==1):
                sum+=v1
                samedays=1
            d2+=1
            day+=1
            # print("day=",day,"sum=",sum)
    else:
        day=d1-1
        while(sum<p):
            sum+=v1
            if(d1==d2  or samedays==1):
                sum+=v2
                samedays=1
            d1+=1
            day+=1
    print(day)
    

#     input
#     6
# 5 4 2 10 100
# 2 5 6 20 15
# 1 2 1 3 14
# 1 16 6 20 15
# 10 16 1 10 5
# 10 4 20 5 40