import sys
sys.stdout = open('SI/Compress-a-string/output.txt', 'w')
sys.stdin = open('SI/Compress-a-string/input.txt', 'r')

tc=int(input())
while(tc>0):
    
    s=input()
    n=len(s)
    s2=""
    count=1
    if(n==1):
        print(s+'1')
    else:
        for i in range(len(s)-1):
            if(s[i] == s[i+1]):
                count+=1
            else:         
                s2=s2+s[i]+str(count)
                count=1 
        s2=s2+s[i+1]+str(count)
        print(s2)
        
    
    
    
    
    tc=tc-1

# a3B4h3e1k2L1 expected