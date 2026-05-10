import java.util.Scanner;
public class Queue {
    int MAX = 5;
    int queue[] = new int[MAX];
    int front = -1;
    int rear = -1;
    public void enqueue(int value) {
        if (rear == MAX - 1) {
            System.out.println("Queue Overflow");
        }   else {
            if (front == -1) {
               front = 0; }
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted into queue");
        } }
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        }else {
        System.out.println(queue[front] + " removed from queue");
            front++; 
        } }
    public void front() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
       } else {
        System.out.println("Front element is: " + queue[front]);
       } }
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty"); 
     }    else {
            System.out.println("\nQueue Elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
                } }  }
    public void isEmpty() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
       } else {
            System.out.println("Queue is NOT Empty");
       } }
    public void isFull() {
        if (rear == MAX - 1) {
            System.out.println("Queue is Full");
        }else {
            System.out.println("Queue is NOT Full");  
        } }
            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        int choice, value;
        do {
            System.out.println("\n===== QUEUE MENU =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("5. Check Empty");
            System.out.println("6. Check Full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = input.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.front();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    q.isEmpty();
                    break;
                case 6:
                    q.isFull();
                    break;
                case 7:
                    System.out.println("Program Ended");
                    break;
                default:
                    System.out.println("Invalid Choice"); 
            }
        } while (choice != 7);
        input.close();
        }  }
