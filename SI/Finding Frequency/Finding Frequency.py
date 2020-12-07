import sys
sys.stdout = open('SI/Finding Frequency/output.txt', 'w')
sys.stdin = open('SI/Finding Frequency/input.txt', 'r')

n=int(input())
x = [int(i) for i in input().split()]
q = int(input())
dict={}
 
for item in x: 
    if (item in dict): 
        dict[item] += 1
    else: 
        dict[item] = 1
for i in range(q):
    k=int(input())
    if(k in dict):
        print(dict[k],end='\n')
    else:
        print(0,end='\n')