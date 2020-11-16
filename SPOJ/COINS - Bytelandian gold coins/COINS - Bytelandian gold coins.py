import sys
sys.stdout = open('SPOJ/COINS - Bytelandian gold coins/output.txt', 'w')
sys.stdin = open('SPOJ/COINS - Bytelandian gold coins/input.txt', 'r')

dp = {}
dp[0] = 0
dp[1] = 1


def recur(n):
    if n in dp:
        return dp[n]
    else:
        dp[n] = max(n, recur(n//2) + recur(n//3) + recur(n//4))
        return dp[n]


while True:
    try:
        n = int(input())
        print(recur(n))
    except:
        break 




    


#  expected
# AP 13
# GP 54