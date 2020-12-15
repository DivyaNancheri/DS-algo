import sys
sys.stdout = open('testing/output.txt', 'w')
sys.stdin = open('testing/input.txt', 'r')

import math  
  
# method to print the divisors 
def printDivisors(n) : 
      
    # Note that this loop runs till square root 
    i = 1
    while i <= math.sqrt(n): 
          
        if (n % i == 0) : 
              
            # If divisors are equal, print only one 
            if (n / i == i) : 
                print(i)
            else : 
                # Otherwise print both 
                print( i , n/i) 
        i = i + 1
  
# Driver method 
print( "The divisors of 100 are: ")
printDivisors(9) 
  
    

    
     
     
            
    


#  expected
# AP 13
# GP 54