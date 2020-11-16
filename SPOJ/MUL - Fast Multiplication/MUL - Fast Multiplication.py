import sys
import math
sys.stdout = open('SPOJ/MUL - Fast Multiplication/output.txt', 'w')
sys.stdin = open('SPOJ/MUL - Fast Multiplication/input.txt', 'r')

tc=int(input())
while(tc>0):
	a = [int(x) for x in input().split()]
	
	print(math.prod(a))
	
	tc-=1


#  expected
# 1
# 2
# 120
# 6