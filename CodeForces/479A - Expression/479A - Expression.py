import sys
sys.stdout = open('CodeForces/479A - Expression/output.txt', 'w')
sys.stdin = open('CodeForces/479A - Expression/input.txt', 'r')


a=int(input())
b=int(input())
c=int(input())
ans=0
ans = max(ans, (a + b) * c)
ans = max(ans, a * (b + c))
ans = max(ans, a * b * c)
ans = max(ans, a + b + c)
print(ans)


# 3 expected