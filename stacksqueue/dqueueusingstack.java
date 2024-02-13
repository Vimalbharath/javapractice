package stacksqueue;

import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/

public class dqueueusingstack {
    public Stack<Integer> first;
    public Stack<Integer> second;

    public dqueueusingstack() {
         first = new Stack<>();
         second = new Stack<>();
        // MyQueue first = new MyQueue();
        // MyQueue second = new MyQueue();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        //while(first!=empty()){
        while(!first.empty()){
        second.push(first.pop());
        }
        int removed=second.pop();
        while(!second.empty()){
        first.push(second.pop());
        }
        return removed;
    }
    
    public int peek() {
         while(!first.empty()){
        second.push(first.pop());
        }
        int removed=second.peek();
        while(!second.empty()){
        first.push(second.pop());
        }
        return removed;
    }
    
    public boolean empty() {
        return first.empty();
    }
    public static void main(String[] args) {
        dqueueusingstack obj = new dqueueusingstack();
  obj.push(1);
  obj.push(2);
  int param_2 = obj.pop();
 int param_3 = obj.peek();
 boolean param_4 = obj.empty();
 System.out.println(param_2);
 System.out.println(param_3);
 System.out.println(param_4);
    }
}
