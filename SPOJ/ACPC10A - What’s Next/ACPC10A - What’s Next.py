import sys
sys.stdout = open('SPOJ/ACPC10A - What’s Next/output.txt', 'w')
sys.stdin = open('SPOJ/ACPC10A - What’s Next/input.txt', 'r')

a,b,c = [int(i) for i in input().split()]
while(a!=0 or b!=0 or c!=0):
    if((b-a) == (c-b)):
        print("AP",c+b-a, sep=" ")
    elif((b/a) == (c/b)):
        print("GP",c*(b//a), sep=" ")
     
    a,b,c = [int(i) for i in input().split()]
    


#  expected
# AP 13
# GP 54