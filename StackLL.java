class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackLL{
    public Node top;
    
    public StackLL(){
        this.top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Element pushed: "+data);
    }
    public void pop(){
        if(top.next==null){
            System.out.println("Stack is empty. Cannot pop.");
        }else{
            System.out.println("Popped element: "+top.data);
            top = top.next;

        }
    }
    public void peek(){
        if(top==null){
            System.out.println("Stack is empty. Cannot peek.");
        }else{
            System.out.println("Stack peek: "+top.data);
        }
    }
    public boolean isEpmty(){
        return top==null;
    }
    public void display(){
        if(isEpmty()){
            System.out.println("Stack is empty. Cannot display.");
        }else{
            Node current = top;
            System.out.print("Stack elements: ");
            while(current!=null){
                System.out.print(current.data+" ");
                current = current.next;
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        StackLL stack  = new StackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.pop();
        stack.display();
    }
}