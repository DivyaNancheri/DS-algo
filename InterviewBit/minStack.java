import java.util.*;
class Solution {
    Stack<Integer> stack = new Stack<Integer>(); 
    Stack<Integer> minStack = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
        if (stack.size() == 1)  
        {  
            minStack.push(x);  
        }
        else if (x <= minStack.peek())  
            minStack.push(x);
    }

    public void pop() {
        if(stack.size() >0){
            if(minStack.peek().equals(stack.peek()))
                minStack.pop();
            stack.pop(); 
        }
    }

    public int top() {
        if(stack.isEmpty())
            return -1;
        return stack.peek();
    }

    public int getMin() {
        if(minStack.isEmpty())
            return -1;
        return minStack.peek();    
    }
    
}
