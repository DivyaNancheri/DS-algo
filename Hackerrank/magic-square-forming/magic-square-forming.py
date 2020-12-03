import sys
sys.stdout = open('Hackerrank/magic-square-forming/output.txt', 'w')
sys.stdin = open('Hackerrank/magic-square-forming/input.txt', 'r')

vis=[False]*10
ar=[]
# for i in range(0,10):
#     ar[i]=i
#     print(ar[i])
N = 3
def isMagicSquare( mat) : 
      
    # calculate the sum of  
    # the prime diagonal 
    s = 0 
      
    for i in range(0, N) : 
        s = s + mat[i][i] 
  
    # the secondary diagonal 
    s2 = 0
    for i in range(0, N) : 
        s2 = s2 + mat[i][N-i-1] 
  
    if(s!=s2) : 
        return False
  
    # For sums of Rows  
    for i in range(0, N) : 
        rowSum = 0;      
        for j in range(0, N) : 
            rowSum += mat[i][j] 
          
        # check if every row sum is 
        # equal to prime diagonal sum 
        if (rowSum != s) : 
            return False
  
    # For sums of Columns 
    for i in range(0, N): 
        colSum = 0
        for j in range(0, N) : 
            colSum += mat[j][i] 
  
        # check if every column sum is  
        # equal to prime diagonal sum 
        if (s != colSum) : 
            return False
  
    return True

s = []
for _ in range(3):
    s.append(list(map(int, input().rstrip().split())))
 

def f(ar,vis,idx):
    if(idx==9):
        if (isMagicSquare(s)) : 
            ans=min(ans, cost(ar,s)) 
            return
    for i in range(1,10):
        if(vis[i]==False){
            ar[idx]=i
            vis[i]=True
            f(ar,vis,idx+1)
            vis[i]=False
        }
        
        
for i in range(3):
    for j in range(3):
        print(s[i][j], end = " ")
    print()    
    
    

# a3B4h3e1k2L1 expected