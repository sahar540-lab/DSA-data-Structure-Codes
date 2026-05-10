import java.util.Scanner;
public class Stack {
    int MAX = 5;
    int stack[] = new int[MAX];
    int top = -1;
    public void push(int value) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");}
        else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");}}
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");}
        else {
            System.out.println(stack[top] + " popped from stack");
            top--;}}
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");}
        else {
            System.out.println("Top element is: " + stack[top]);} }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");}
        else {
            System.out.println("\nStack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);  }  } }
    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is Empty"); }
        else {
            System.out.println("Stack is NOT Empty"); } }
    public void isFull() {
        if (top == MAX - 1) {
            System.out.println("Stack is Full");  }
        else {
            System.out.println("Stack is NOT Full");    } }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        int choice, value;
        do {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check Empty");
            System.out.println("6. Check Full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = input.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek()
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    s.isEmpty();
                    break;
                case 6:
                    s.isFull();
                    break;
                case 7:
                    System.out.println("Program Ended");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 7);
        input.close(); } }
