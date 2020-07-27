import java.util.Stack;
/*
用两个栈模拟队列
 */
public class teo {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }else{
            return stack2.pop();
        }

        return stack2.pop();
    }
}
