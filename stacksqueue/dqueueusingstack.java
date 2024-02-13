package stacksqueue;

import java.util.Stack;

public class dqueueusingstack {
    public dqueueusingstack() {
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        // MyQueue first = new MyQueue();
        // MyQueue second = new MyQueue();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!empty()){
        second.push(first.pop());
        }
        int removed=second.pop();
        while(!empty()){
        first.push(second.pop());
        }
    }
    
    public int peek() {
        
    }
    
    public boolean empty() {
        return first.empty();
    }
}
