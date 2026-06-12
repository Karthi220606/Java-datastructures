class Q {
    int[] queue;
    int size;
    int rear, front;

    Q(int n) {
        front = -1;
        rear = -1;
        size = n;
        queue = new int[n];
    }

    void enqueue(int n) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        } 
        else {
            if (front == -1) {
                front = 0;
            }
            queue[++rear] = n;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed Element " + queue[front++]);

        if (front > rear) {
            front = rear = -1;
        }
    }
}

public class Queues{

	public static void main(String[] args) {
		Q q=new Q(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
}
}
