import java.util.*;
class MyQueue {
    
    Stack<Integer> st1 = new Stack();
    Stack<Integer> st2 = new Stack();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        // st1.push(x);
        while(!(st2.empty())){
            st1.push(st2.peek());
            st2.pop();
        }
        st1.push(x);
        while(!st1.empty()){
            st2.push(st1.peek());
            st1.pop();
        }
    }
    
    public int pop() {
        return(st2.pop());
    }
    
    public int peek() {
        return(st2.peek());
    }
    
    public boolean empty() {
        return(st2.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

//https://leetcode.com/problems/implement-queue-using-stacks/submissions/
