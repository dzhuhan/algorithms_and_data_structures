class Stack {
    private int tos;
    private int size;
    private int items[];
    
    public Stack(int size){
        items = new int[size];
        this.size = size;
        tos = 0;
    }
    
    public void push(int a){
        if(tos < size){
            items[tos] = a;
            tos++;
        }
        else
            System.out.println("Stack is full");
    }
    
    public int pop(){
        if(tos > 0)
        {
            tos--;
            return items[tos];
        }
        else
        {
            System.out.println("Stack is empty");
            return 0;
        }
    }
    
    public int peek(){
        if(tos > -1)
            return items[tos - 1];
        else
        {
            System.out.println("Stack is empty");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(1);
        s.push(445);
        s.push(89);
        s.push(3);
        System.out.println("peek: " + s.peek());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        s.pop();
    }
}