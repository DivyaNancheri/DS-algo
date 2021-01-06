public class Solution {
    public int solve(String A) {
        
        Stack s = new Stack();
        for(int i=0;i<A.length();i++){
            char x = A.charAt(i); 
            if(x=='('){
                s.push(A.charAt(i));
            }
            if(x==')'){
                if(!s.isEmpty()){
                    s.pop();
                }
                else 
                    return 0;
            }
        
        }
 
    
        if(s.isEmpty()){
            return 1;
        }else 
            return 0;
    }
}
