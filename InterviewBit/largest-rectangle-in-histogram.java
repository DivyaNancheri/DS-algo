public class Solution {
    public int largestRectangleArea(ArrayList<Integer> ar) {
        Stack<Integer> stack = new Stack<>();
        int max = 0,x,area;  
       
        int i = 0; 
        while (i < ar.size()) 
        { 
            if (stack.empty() || ar.get(stack.peek()) <= ar.get(i)){
                stack.push(i++); 
            } 
            else
            { 
                x = stack.peek();
                stack.pop();
                if(stack.empty()){
                    area=ar.get(x)*i;
                }
                else{
                    area=ar.get(x)*(i-stack.peek()-1);
                }
                max=Math.max(max,area);
            } 
        } 
       
        
        while (stack.empty() == false) 
        { 
            x = stack.peek();
            stack.pop();
            if(stack.empty()){
                area=ar.get(x)*i;
            }
            else{
                area=ar.get(x)*(i-stack.peek()-1);
            }
            max=Math.max(max,area);
        } 
        
        return max;
    }
}

